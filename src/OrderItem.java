import java.util.LinkedList;

public class OrderItem {
    private Product product;
    private int count;
    public Product getProduct() {
        return product;
    }


    public String getProductName(){
        return product.getName();
    }

    public int getCount(){
        return count;
    }

    public OrderItem(Product product, int count){
        this.product = product;
        this.count = count;
    }
}
