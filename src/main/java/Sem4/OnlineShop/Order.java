package Sem4.OnlineShop;

public class Order {
    private Buyer buyer;
    private Product product;
    private int quantity;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
