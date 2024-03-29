package com.example.gestioncinema.entities;

import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name="ticketProj",types=Ticket.class)
public interface TicketProjection {
    public Long getId();
    public String getNomClient();
    public double getPrix();
    public Integer getCodePayement();
    public boolean isReserve();
    public Place getPlace();
}
