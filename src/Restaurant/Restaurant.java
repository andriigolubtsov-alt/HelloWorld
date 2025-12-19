package Restaurant;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {

    private Map<String, Order> orders = new HashMap<>();

    // add order
    public void addOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    // remove order by number
    public void removeOrder(String orderNumber) {
        orders.remove(orderNumber);
    }

    // find order by number
    public Order findOrder(String orderNumber) {
        return orders.get(orderNumber);
    }

    // print all orders
    public void printAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders in the restaurant.");
            return;
        }
        for (Order order : orders.values()) {
            System.out.println(order);
        }
    }
}
