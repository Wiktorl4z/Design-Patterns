package notification;

import order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("Mobile App - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }

}
