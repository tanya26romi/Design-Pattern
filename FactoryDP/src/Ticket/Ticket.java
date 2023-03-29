package Ticket;

import Ticket.Enum.SelectedTicketType;
import Ticket.TicketFactory.TicketFactory;

public class Ticket {

    private final SelectedTicketType selectedTicketType;

    public Ticket(SelectedTicketType selectedTicketType) {
        this.selectedTicketType = selectedTicketType;
    }

    public void setBooked(){
        System.out.println("This Ticket is Booked");
    }

    public void setInstructions(){
        System.out.println("Read Instructions");
    }

    public TicketFactory createTicketFactoryFactory(){
        return TicketFactoryFactory.createTicketFactory(this.selectedTicketType);
    }
}
