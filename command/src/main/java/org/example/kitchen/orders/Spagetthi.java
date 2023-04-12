package org.example.kitchen.orders;

import org.example.kitchen.Chef;

import java.util.Arrays;

public class Spagetthi implements Order {

    private final String[] ingridients = {"Pasta", "Meat", "Tomato sauce"};

    private final Chef chef;

    public Spagetthi(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("Creating spagetthi from ingridients:");
        Arrays.stream(ingridients).forEach(ingridient -> System.out.println("\t" + ingridient));
        chef.cook();
        System.out.println("Spagetthi is done.");
    }
}
