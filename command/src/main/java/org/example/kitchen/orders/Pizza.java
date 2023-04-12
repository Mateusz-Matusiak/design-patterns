package org.example.kitchen.orders;

import org.example.kitchen.Chef;

import java.util.Arrays;

public class Pizza implements Order {

    private final String[] ingridients = {"Mozzarella", "San Marino's tomatos sauce", "Ham"};
    private final Chef chef;

    public Pizza(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("Creating pizza from ingridients:");
        Arrays.stream(ingridients).forEach(ingridient -> System.out.println("\t" + ingridient));
        chef.cook();
        System.out.println("Pizza is done.");
    }
}
