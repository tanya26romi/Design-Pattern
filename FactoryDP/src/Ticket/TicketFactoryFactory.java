package Ticket;

import Ticket.Enum.SelectedTicketType;
import Ticket.TicketFactory.BusinessTicketFactory;
import Ticket.TicketFactory.EconomyTicketFactory;
import Ticket.TicketFactory.PremiumTicketFactory;
import Ticket.TicketFactory.TicketFactory;

public class TicketFactoryFactory {
    public static TicketFactory createTicketFactory(SelectedTicketType selectedTicketType){
        if(selectedTicketType.equals(SelectedTicketType.BUSINESS)){
            return new BusinessTicketFactory();
        }

        else if(selectedTicketType.equals(SelectedTicketType.PREMIUM)){
            return new PremiumTicketFactory();
        }
        else if(selectedTicketType.equals(SelectedTicketType.ECONOMY)){
            return new EconomyTicketFactory();
        }

        return null;
    }
}
