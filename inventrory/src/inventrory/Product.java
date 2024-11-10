package inventrory;

public class Product {
    private String productId;
    private String name;
    private int quantity;
    private String supplierName;
    private int reorderLevel;

    public Product(String productId, String name, int quantity, String supplierName, int reorderLevel) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.reorderLevel = reorderLevel;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

 
    public String toString() {
        return productId + " | " + name + " | " + quantity + " | " + supplierName + " | " + reorderLevel;
    }
}
