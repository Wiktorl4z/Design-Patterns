package notification;

import order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("E-mail - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }

}
