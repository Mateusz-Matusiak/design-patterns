package org.example.kitchen;

public class Chef {
    private static Chef singleton = null;

    private Chef() {}

    public Chef createChef() {
        if(singleton == null) {
            singleton = new Chef();
        }
        return singleton;
    }
}
