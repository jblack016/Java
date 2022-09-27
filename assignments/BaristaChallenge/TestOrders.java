import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        Item item1 = new Item("Mocha", 2.50);
        Item item2 = new Item("Latte", 3.99);
        Item item3 = new Item("Drip Coffee", 1.50);
        Item item4 = new Item("Capuccino", 4.50);
        
        // Orders
        
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Sam");


        // Application Simulations

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item3);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item2);

        // Implement the getStatusMessage

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        // Change Ready Status and implenment getStatusMessage

        order1.setReady(true);
        order3.setReady(true);
        order5.setReady(true);
        
        System.out.println(order1.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        // Print Order Totals for each order

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        // Implement the display method

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}