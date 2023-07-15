package com.scaler.lld.projects.parking_lot.dtos;

import com.scaler.lld.projects.parking_lot.models.Ticket;

public class GenerateBillRequestDTO {

    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public GenerateBillRequestDTO(Ticket ticket) {
        this.ticket = ticket;
    }
}
