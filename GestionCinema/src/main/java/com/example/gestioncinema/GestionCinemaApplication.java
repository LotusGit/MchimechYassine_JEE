package com.example.gestioncinema;

import com.example.gestioncinema.entities.Film;
import com.example.gestioncinema.entities.Salle;
import com.example.gestioncinema.entities.Ticket;
import com.example.gestioncinema.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GestionCinemaApplication implements CommandLineRunner {

    @Autowired
    private ICinemaInitService iCinemaInitService;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(GestionCinemaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Film.class);
        iCinemaInitService.initVilles();
        iCinemaInitService.initCinemas();
        iCinemaInitService.initSalles();
        iCinemaInitService.initPlaces();
        iCinemaInitService.initSeances();
        iCinemaInitService.initCategories();
        iCinemaInitService.initFilms();
        iCinemaInitService.initProjections();
        iCinemaInitService.initTickets();
    }
}
