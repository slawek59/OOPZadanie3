public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Yamaha Pacifica", 1700);
        Product product2 = new Product("Jackson King V", 1500);
        Product product3 = new Product("Gibson Les Paul", 7500);
        Product product4 = new Product("Fender Telecaster", 6500);
        Product product5 = new Product("Tortex Guitar Pick", 5);

        Customer customer1 = new Customer("Stefan");
        Customer customer2 = new Customer("Marian");

        OrderItem yamaha = new OrderItem(product1, 1);
        customer1.addToCart(yamaha);
        OrderItem guitarPicks = new OrderItem(product5, 10);
        customer1.addToCart(guitarPicks);
        customer1.createOrder();
    }
}