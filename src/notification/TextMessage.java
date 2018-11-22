package notification;

import order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }

}
