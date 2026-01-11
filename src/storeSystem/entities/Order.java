package storeSystem.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();
    private int number;
    private LocalDateTime moment;
    private OrderStatus status;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(LocalDateTime moment, int number, OrderStatus status) {
        this.moment = moment;
        this.number = number;
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getNumber() {
        return number;
    }

    public String getMoment() {
        return moment.format(formatter);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addProduct(Product p) {
        if (status == OrderStatus.CANCELED || status == OrderStatus.SHIPPED) {
            System.out.println("It is not possible to add products while the status is SENT/CANCELLED.");
            return;
        }
        products.add(p);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public String showSummary() {
        return "Summary of order:\n" +
                "Date: " +
                getMoment() +
                "\nStatus: " +
                getStatus() +
                "\nNumber: " +
                getNumber() +
                "\nProducts: " +
                getProducts();
    }
}