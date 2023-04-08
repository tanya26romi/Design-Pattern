public class WareHouse implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    WareHouse() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderCancelEvent() {
        ReturnData orderData = new ReturnData();
        orderData.setData("The order is cancelled by WareHouse");
        return orderData;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData orderData = new ReturnData();
        orderData.setData("The order is placed by warehouse");
        return orderData;
    }
}
