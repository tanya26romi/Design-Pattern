package Ticket.TicketFactory;

import Ticket.Component.DrinksMenu.DrinksMenu;
import Ticket.Component.FoodMenu.FoodMenu;
import Ticket.Component.Price.Price;
import Ticket.Component.SeatType.SeatType;

public interface TicketFactory {

    DrinksMenu showDrinksMenu();
    FoodMenu showFoodMenu();
    SeatType showSeatType();
    Price showPrice();
}
