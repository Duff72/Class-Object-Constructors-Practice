public class Product {
    // Attributes
    private double cost;
    private int quantity;
    private String name;

    // Constructor
    public Product(double cost, int quantity, String name) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    // Method to calculate and print the total cost
    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + name + " is: $" + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Quantity purchased: " + quantity);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Create a Product object with a cost of $15.99 per unit, 3 units, and a product name of "Wireless Mouse"
        Product myProduct = new Product(15.99, 3, "Wireless Mouse");

        // Call the printProduct method
        myProduct.printProduct();

        // Call the totalCost method
        myProduct.totalCost();
    }
}
