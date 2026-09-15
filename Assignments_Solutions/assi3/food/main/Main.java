package food.main;

import food.model.*;
import food.utility.OrderUtility;

public class Main {

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Rahul", 500);
        orders[1] = new PremiumOrder(102, "Aman", 1000);
        orders[2] = new RegularOrder(103, "Riya", 700);
        orders[3] = new PremiumOrder(104, "Neha", 1200);
        orders[4] = new RegularOrder(105, "Karan", 800);
        orders[5] = new PremiumOrder(106, "Priya", 1500);

        for (FoodOrder order : orders) {

            if (!OrderUtility.validateAmount(order.getAmount()) ||
                !OrderUtility.validateCustomerName(order.getCustomerName())) {

                System.out.println("Invalid Order!");
                continue;
            }

            System.out.println("\n-------------------------");
            OrderUtility.generateOrderSummary(order);

            Discountable discountable = (Discountable) order;

            double discount = discountable.applyDiscount();
            double delivery = order.calculateDeliveryCharge();

            double finalAmount =
                    order.getAmount() - discount + delivery;

            System.out.println("Discount: Rs. " + discount);
            System.out.println("Delivery Charge: Rs. " + delivery);
            System.out.println("Final Payable: Rs. " + finalAmount);
        }

        System.out.println("\n-------------------------");
        System.out.println("Restaurant: " + FoodOrder.restaurantName);

        FoodOrder.displayTotalOrders();
    }
}