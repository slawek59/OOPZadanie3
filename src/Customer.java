import java.util.LinkedList;

public class Customer {
    private String name;
    private LinkedList<OrderItem> listOfOrderItems = new LinkedList<>();
    private LinkedList<Order> listOfOrders = new LinkedList<>();

    public String getName(){
        return this.name;
    }

    public Customer(String name){
        this.name = name;
    }

    public void addToCart(OrderItem orderItem){
        this.listOfOrderItems.add(orderItem);
        System.out.println(orderItem.getProductName() + " added to the cart.");
    }

    public void createOrder() {
        Order order = new Order(listOfOrderItems);
        listOfOrders.add(order);
        listOfOrderItems.clear();
        System.out.println("Order created. Total: " + order.calculateTotalPrice() + " zł");
    }

    public void printOrderHistory() {
        System.out.println("Order history for " + name + ":");
        for (Order order : listOfOrders) {
            System.out.println("Status: " + order.getStatus() + ", Total: " + order.calculateTotalPrice() + " zł");
        }
    }


}
