package notification;

import order.Order;

public class MobileApp implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("Mobile App - order number: " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }
}
