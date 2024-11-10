package inventrory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added successfully!");
    }

    public void viewProducts() {
        System.out.println("=== Product List ===");
        System.out.println("-------------------------------------------------------");
        System.out.println("Product ID | Name | Quantity | Supplier | Reorder Level");
        System.out.println("-------------------------------------------------------");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public void updateStock(String productId, int newQuantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            System.out.println("Stock quantity updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public void placeOrder(Order order){
        orders.add(order);
        System.out.println("Restock order placed successfully!");
    }

    public void viewOrders(){
        System.out.println("=== Order History ===");
        System.out.println("Order ID | Product ID | Quantity | Order Date");
        System.out.println("---------------------------------------------");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

