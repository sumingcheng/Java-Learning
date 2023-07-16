package com.DesignPattern.adapter;

public class PowerForEuroImpl implements IPowerForEuro {

    @Override
    public void insert () {
        System.out.println("Inserting power with" + INTERFACE_EURO + " interface");
    }
}
