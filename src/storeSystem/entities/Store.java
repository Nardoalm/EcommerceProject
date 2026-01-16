package storeSystem.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class Store {
    private final ArrayList<Order> orders = new ArrayList<>();

    public void createOrder(LocalDateTime moment, int number, OrderStatus status){
        Order o = new Order(moment, number, status);
        orders.add(o);
    }

    public Order findOrderByNumber(int number){
        for (Order order : orders){
            if(order.getNumber() == number){
                return order;
            }
        }
        return null;
    }

    public void listOrders() {

        if (orders.isEmpty()) {
            System.out.println("No orders registered..");
            return;
        }

        for (Order order : orders) {
            System.out.println(order.showSummary());
            System.out.println("--------------------");
        }
    }

}
