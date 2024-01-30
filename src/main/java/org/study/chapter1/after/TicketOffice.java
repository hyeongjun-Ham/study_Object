package org.study.chapter1.after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long amount;

    private List<Ticket> tickets = new ArrayList<>();

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
