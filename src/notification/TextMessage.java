package notification;

import order.Order;

public class TextMessage implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("SMS - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }
}
