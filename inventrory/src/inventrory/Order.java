package inventrory;

public class Order {
    private String orderId;
    private String productId;
    private int orderQuantity;
    private String orderDate;

    public Order(String orderId, String productId, int orderQuantity, String orderDate) {
        this.orderId = orderId;
        this.productId = productId;
        this.orderQuantity = orderQuantity;
        this.orderDate = orderDate;
    }

    public String toString() {
        return orderId + " | " + productId + " | " + orderQuantity + " | " + orderDate;
    }
}
