package Restaurant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        // create orders
        Order o1 = new Order(
                "001",
                "Andrii",
                Arrays.asList("Pizza", "Cola")
        );

        Order o2 = new Order(
                "002",
                "Maria",
                Arrays.asList("Pasta", "Tea")
        );

        // add orders
        restaurant.addOrder(o1);
        restaurant.addOrder(o2);

        System.out.println("All orders:");
        restaurant.printAllOrders();

        // find order
        System.out.println("\nFind order 001:");
        System.out.println(restaurant.findOrder("001"));

        // remove order
        restaurant.removeOrder("001");

        System.out.println("\nAfter removing order 001:");
        restaurant.printAllOrders();
    }
}
