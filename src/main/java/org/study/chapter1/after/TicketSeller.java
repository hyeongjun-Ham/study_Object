package org.study.chapter1.after;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
