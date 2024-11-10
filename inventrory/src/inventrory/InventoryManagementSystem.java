package inventrory;

import java.util.Scanner;

public class InventoryManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("1. Add New Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Stock Quantity");
            System.out.println("4. Place Restock Order");
            System.out.println("5. View Orders");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    inventory.viewProducts();
                    break;
                case 3:
                    updateStockQuantity();
                    break;
                case 4:
                    placeRestockOrder();
                    break;
                case 5:
                    inventory.viewOrders();
                    break;
                case 6:
                    System.out.println("Exiting Inventory Management System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewProduct() {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Supplier Name: ");
        String supplierName = scanner.nextLine();
        System.out.print("Enter Reorder Level: ");
        int reorderLevel = scanner.nextInt();
        scanner.nextLine(); 

        Product product = new Product(productId, name, quantity, supplierName, reorderLevel);
        inventory.addProduct(product);
    }

    private static void updateStockQuantity() {
        System.out.print("Enter Product ID to update: ");
        String productId = scanner.nextLine();
        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();
        scanner.nextLine(); 

        inventory.updateStock(productId, newQuantity);
    }

    private static void placeRestockOrder() {
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Order Quantity: ");
        int orderQuantity = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Order Date (yyyy-mm-dd): ");
        String orderDate = scanner.nextLine();

        Order order = new Order(orderId, productId, orderQuantity, orderDate);
        inventory.placeOrder(order);
    }
}
