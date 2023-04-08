public class Customer implements OrderCancelledSubscriber, OrderPlacedSubscriber {

    public Customer() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderCancelEvent() {
        ReturnData orderData = new ReturnData();
        orderData.setData("The order is cancelled by Customer");
        return orderData;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData orderData = new ReturnData();
        orderData.setData("The order is placed by customer");
        return orderData;
    }
}
