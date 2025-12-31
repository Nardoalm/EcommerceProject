package storeSystem.application;

import storeSystem.entities.Order;
import storeSystem.entities.OrderStatus;
import storeSystem.entities.Product;
import storeSystem.entities.Store;
import storeSystem.entities.productsTypes.DigitalProduct;
import storeSystem.entities.productsTypes.PhysicalProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Store store = new Store();

        int option = -1;

        while (option != 0) {

            System.out.println();
            System.out.println("1 - Create order");
            System.out.println("2 - Add physical product");
            System.out.println("3 - Add digital product");
            System.out.println("4 - Show order");
            System.out.println("5 - List orders");
            System.out.println("6 - Change order status");
            System.out.println("0 - Leave");
            System.out.print("Option: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1:
                    LocalDateTime moment = LocalDateTime.now();
                    System.out.print("Order number: ");
                    int number = ThreadLocalRandom.current().nextInt(100000, 1000000);
                    System.out.println(number);

                    store.createOrder(moment, number, OrderStatus.OPEN);
                    System.out.println("Order created.");
                    break;

                case 2:
                    System.out.print("Order number: ");
                    number = sc.nextInt();
                    sc.nextLine();

                    Order order = store.findOrderByNumber(number);
                    if (order == null) {
                        System.out.println("Order not found.");
                        break;
                    }

                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Shipping cost: ");
                    double shippingCost = sc.nextDouble();
                    sc.nextLine();

                    Product physical = new PhysicalProduct(name, price, id, shippingCost);
                    order.addProduct(physical);
                    System.out.println("Physical product added.");
                    break;

                case 3:
                    System.out.print("Order number: ");
                    number = sc.nextInt();
                    sc.nextLine();

                    order = store.findOrderByNumber(number);
                    if (order == null) {
                        System.out.println("Order not found.");
                        break;
                    }

                    System.out.print("Product ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Price: ");
                    price = sc.nextDouble();

                    System.out.print("Download fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();

                    Product digital = new DigitalProduct(name, price, id, fee);
                    order.addProduct(digital);
                    System.out.println("Digital product added.");
                    break;

                case 4:
                    System.out.print("Order number: ");
                    number = sc.nextInt();
                    sc.nextLine();

                    order = store.findOrderByNumber(number);
                    if (order == null) {
                        System.out.println("Order not found.");
                    } else {
                        System.out.println(order.showSummary());
                    }
                    break;

                case 5:
                    store.listOrders();
                    break;

                case 6:
                    System.out.print("Order number: ");
                    number = sc.nextInt();
                    sc.nextLine();

                    order = store.findOrderByNumber(number);
                    if (order == null) {
                        System.out.println("Order not found.");
                        break;
                    }

                    System.out.println("Current status: " + order.getStatus());
                    System.out.println("1 - OPEN");
                    System.out.println("2 - PAID");
                    System.out.println("3 - SHIPPED");
                    System.out.println("4 - CANCELED");
                    System.out.print("New status: ");

                    int st = sc.nextInt();
                    sc.nextLine();

                    switch (st) {
                        case 1 -> order.setStatus(OrderStatus.OPEN);
                        case 2 -> order.setStatus(OrderStatus.PAID);
                        case 3 -> order.setStatus(OrderStatus.SHIPPED);
                        case 4 -> order.setStatus(OrderStatus.CANCELED);
                        default -> System.out.println("Status invalid.");
                    }

                    System.out.println("Status updated.");
                    break;

                case 0:
                    System.out.println("Leaving...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
