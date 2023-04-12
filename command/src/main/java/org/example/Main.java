package org.example;

import org.example.kitchen.Chef;
import org.example.kitchen.Waiter;
import org.example.kitchen.orders.Pizza;
import org.example.kitchen.orders.Spagetthi;

public class Main {
    public static void main(String[] args) {
        Waiter elizabethWaiter = new Waiter();
        Chef chef = Chef.createChef();

        elizabethWaiter.takeNewOrder(new Pizza(chef));
        elizabethWaiter.takeNewOrder(new Spagetthi(chef));

        elizabethWaiter.giveOrder();
        elizabethWaiter.giveOrder();
        elizabethWaiter.giveOrder();
    }
}