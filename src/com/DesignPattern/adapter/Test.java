package com.DesignPattern.adapter;

public class Test {
    public static void main (String[] args) {
//        IPowerForChina powerForChina = new PowerForChinaImpl();
//        powerForChina.insert();
//        powerWork(powerForChina);

        IPowerForEuro powerForEuro = new PowerForEuroImpl();
        PowerAdapter powerAdapter1 = new PowerAdapter(powerForEuro);
        powerWork(powerAdapter1);

        IPowerForChina powerForChina = new PowerForChinaImpl();
        PowerAdapter powerAdapter2 = new PowerAdapter(powerForChina);
        powerWork(powerAdapter2);
    }

    public static void powerWork (IPowerForChina powerForChina) {
        System.out.println("Power work");
        powerForChina.insert();
        System.out.println("Power work done");
    }
}
