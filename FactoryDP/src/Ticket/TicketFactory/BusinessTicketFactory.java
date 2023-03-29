package Ticket.TicketFactory;

import Ticket.Component.DrinksMenu.BusinessDrinksMenu;
import Ticket.Component.DrinksMenu.DrinksMenu;
import Ticket.Component.FoodMenu.BusinessFoodMenu;
import Ticket.Component.FoodMenu.FoodMenu;
import Ticket.Component.Price.BusinessPrice;
import Ticket.Component.Price.Price;
import Ticket.Component.SeatType.BusinessSeatType;
import Ticket.Component.SeatType.SeatType;
import Ticket.TicketFactory.TicketFactory;

public class BusinessTicketFactory implements TicketFactory {
    @Override
    public DrinksMenu showDrinksMenu() {
        return new BusinessDrinksMenu();
    }

    @Override
    public FoodMenu showFoodMenu() {
        return new BusinessFoodMenu();
    }

    @Override
    public SeatType showSeatType() {
        return new BusinessSeatType();
    }

    @Override
    public Price showPrice() {
        return new BusinessPrice();
    }
}
