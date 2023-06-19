package com.example.gestioncinema.web;

import com.example.gestioncinema.entities.Film;
import com.example.gestioncinema.entities.Ticket;
import com.example.gestioncinema.repositories.FilmRepository;
import com.example.gestioncinema.repositories.TicketRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class CinemaRestController {
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @GetMapping(value = "/imageFilm/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(@PathVariable(name="id")Long id) throws Exception{
        Film film = filmRepository.findById(id).get();
        String photoName = film.getPhoto();
        File file = new File(System.getProperty("user.home")+"/Desktop/School/J2EE/images/"+photoName);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);
    }
    @PostMapping("/payerTickets")
    @Transactional
    public List<Ticket> payerTicket(@RequestBody TicketForm ticketForm){
        List<Ticket> ticketList = new ArrayList<>();
        ticketForm.getTickets().forEach(idTicket->{
            Ticket ticket = ticketRepository.findById(idTicket).get();
            ticket.setNomClient(ticketForm.getNomClient());
            ticket.setReserve(true);
            ticket.setCodePayement(ticketForm.getCodePayement());
            ticketRepository.save(ticket);
            ticketList.add(ticket);
        });
        return ticketList;
    }
}

@Data
class TicketForm{
    private String nomClient;
    private int codePayement;
    private List<Long> tickets = new ArrayList<>();

}