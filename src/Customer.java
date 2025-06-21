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

    public void createOrder(){
        for (OrderItem orderItem : listOfOrderItems){
            listOfOrders
        }

        System.out.println("Order created.");
    }
}
