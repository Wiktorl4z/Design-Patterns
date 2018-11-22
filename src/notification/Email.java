package notification;

import order.Order;

public class Email implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("E-mail - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }
}
