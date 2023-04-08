import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private List<OrderCancelledSubscriber> orderCancelledSubscriberList;
    private List<OrderPlacedSubscriber> orderPlacedSubscriberList;
    private static Amazon instance = null;

    private Amazon() {
        orderPlacedSubscriberList = new ArrayList<>();
        orderCancelledSubscriberList = new ArrayList<>();
    }

    public static Amazon getInstance() {
        if (instance == null) {
            synchronized (Amazon.class) {
                if (instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void deregisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscriberList.add(orderCancelledSubscriber);
    }

    public void deRegisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscriberList.remove(orderCancelledSubscriber);
    }

    public void orderPlaced() {
        for (OrderPlacedSubscriber orders : orderPlacedSubscriberList) {
            orders.orderPlaceEvent();
        }
    }
}
