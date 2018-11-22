import notification.Email;
import notification.MobileApp;
import notification.TextMessage;
import order.Order;
import order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(123L, OrderStatus.REGISTERED);

        Email email = new Email();
        MobileApp mobileApp = new MobileApp();
        TextMessage textMessage = new TextMessage();

        email.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        textMessage.updateOrderStatus(order);

    }
}
