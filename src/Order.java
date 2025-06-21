import java.util.*;


public class Order {
    public enum Status {
        RECEIVED,
        SENT,
        SHIPPED
    }

    private LinkedList<OrderItem> items;
    private Status status;

    public Order(LinkedList<OrderItem> items) {
        this.items = new LinkedList<>(items);
        this.status = Status.RECEIVED;
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getCount() * item.getProduct().getPrice();
        }
        return total;
    }

    public void markAsShipped() {
        this.status = Status.SHIPPED;
    }

    public Status getStatus() {
        return status;
    }
}
