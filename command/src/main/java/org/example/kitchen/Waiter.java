package org.example.kitchen;

import org.example.kitchen.orders.Order;

import java.util.LinkedList;
import java.util.Queue;

public class Waiter {
    private final Queue<Order> orders;

    public Waiter() {
        orders = new LinkedList<>();
    }

    public void takeNewOrder(Order order) {
        orders.add(order);
    }

    public Order giveOrder() {
        if (orders.size() < 1) {
            System.out.println("No more orders!");
            throw new RuntimeException("No more orders!");
        }

        Order order = orders.poll();
        order.execute();
        return order;
    }
}
