import java.util.ArrayList;
import java.util.Scanner;

class Order {
    private int orderId;
    private String customerName;
    private String orderDetails;
    private String status;

    public Order(int orderId, String customerName, String orderDetails, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Details: " + orderDetails + ", Status: " + status;
    }
}

public class OrderTrackingSystem {
    private static ArrayList<Order> orders = new ArrayList<>();
    private static int nextOrderId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Restaurant Order Tracking System ---");
            System.out.println("1. Add Order");
            System.out.println("2. View Orders");
            System.out.println("3. Update Order Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addOrder(scanner);
                    break;
                case 2:
                    viewOrders();
                    break;
                case 3:
                    updateOrderStatus(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addOrder(Scanner scanner) {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter order details: ");
        String orderDetails = scanner.nextLine();
        
        Order newOrder = new Order(nextOrderId++, customerName, orderDetails, "Pending");
        orders.add(newOrder);
        System.out.println("Order added successfully! Order ID: " + newOrder.getOrderId());
    }

    private static void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            System.out.println("\n--- Current Orders ---");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    private static void updateOrderStatus(Scanner scanner) {
        System.out.print("Enter Order ID to update: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                System.out.print("Enter new status (e.g., Pending, In Progress, Completed): ");
                String newStatus = scanner.nextLine();
                order.setStatus(newStatus);
                System.out.println("Order status updated successfully!");
                return;
            }
        }

        System.out.println("Order ID not found.");
    }
}
