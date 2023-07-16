package com.DesignPattern.adapter;

public class PowerForChinaImpl implements IPowerForChina {

    @Override
    public void insert () {
        System.out.println("Inserting power with" + INTERFACE_CHINA + " interface");
    }
}
