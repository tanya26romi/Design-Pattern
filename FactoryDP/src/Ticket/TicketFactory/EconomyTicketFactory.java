package Ticket.TicketFactory;

import Ticket.Component.DrinksMenu.DrinksMenu;
import Ticket.Component.DrinksMenu.EconomyDrinksMenu;
import Ticket.Component.FoodMenu.EconomyFoodMenu;
import Ticket.Component.FoodMenu.FoodMenu;
import Ticket.Component.Price.EconomyPrice;
import Ticket.Component.Price.Price;
import Ticket.Component.SeatType.EconomySeatType;
import Ticket.Component.SeatType.SeatType;

public class EconomyTicketFactory implements TicketFactory{
    @Override
    public DrinksMenu showDrinksMenu() {
        return new EconomyDrinksMenu();
    }

    @Override
    public FoodMenu showFoodMenu() {
        return new EconomyFoodMenu();
    }

    @Override
    public SeatType showSeatType() {
        return new EconomySeatType();
    }

    @Override
    public Price showPrice() {
        return new EconomyPrice();
    }
}
