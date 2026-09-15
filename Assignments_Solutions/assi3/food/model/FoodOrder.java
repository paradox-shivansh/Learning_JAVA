package food.model;

public abstract class FoodOrder {

    private int orderId;
    private String customerName;
    private double amount;

    static String restaurantName = "Food Hub";

    private static int orderCount = 0;

    public FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        orderCount++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void displayTotalOrders() {
        System.out.println("Total Orders: " + orderCount);
    }

    public abstract double calculateDeliveryCharge();
}