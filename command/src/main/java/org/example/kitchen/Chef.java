package org.example.kitchen;

public class Chef {
    private static Chef singleton = null;

    private Chef() {}

    public static Chef createChef() {
        if(singleton == null) {
            singleton = new Chef();
        }
        return singleton;
    }

    public void cook() {
        System.out.println("Cooking....");
    }
}
