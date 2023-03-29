package Ticket;

import Ticket.Component.DrinksMenu.DrinksMenu;
import Ticket.Component.FoodMenu.FoodMenu;
import Ticket.Component.Price.Price;
import Ticket.Component.SeatType.SeatType;
import Ticket.Enum.SelectedTicketType;
import Ticket.TicketFactory.TicketFactory;

public class Client {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(SelectedTicketType.BUSINESS);
        TicketFactory ticketFactory = ticket.createTicketFactoryFactory();
        DrinksMenu drinksMenu = ticketFactory.showDrinksMenu();
        FoodMenu foodMenu = ticketFactory.showFoodMenu();
        SeatType seatType = ticketFactory.showSeatType();
        Price price = ticketFactory.showPrice();
    }
}
