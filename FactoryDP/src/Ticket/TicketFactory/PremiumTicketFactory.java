package Ticket.TicketFactory;

import Ticket.Component.DrinksMenu.DrinksMenu;
import Ticket.Component.DrinksMenu.PremiumDrinksMenu;
import Ticket.Component.FoodMenu.FoodMenu;
import Ticket.Component.FoodMenu.PremiumFoodMenu;
import Ticket.Component.Price.BusinessPrice;
import Ticket.Component.Price.Price;
import Ticket.Component.SeatType.PremiumSeatType;
import Ticket.Component.SeatType.SeatType;

public class PremiumTicketFactory implements TicketFactory{
    @Override
    public DrinksMenu showDrinksMenu() {
        return new PremiumDrinksMenu();
    }

    @Override
    public FoodMenu showFoodMenu() {
        return new PremiumFoodMenu();
    }

    @Override
    public SeatType showSeatType() {
        return new PremiumSeatType();
    }

    @Override
    public Price showPrice() {
        return new BusinessPrice();
    }
}
