package com.DesignPattern.adapter;

public class PowerAdapter implements IPowerForChina {
    private IPowerForEuro powerForEuro;
    private IPowerForChina powerForChina;

    public PowerAdapter (IPowerForEuro powerForEuro) {
        this.powerForEuro = powerForEuro;
    }

    public PowerAdapter (IPowerForChina powerForChina) {
        this.powerForChina = powerForChina;
    }

    @Override
    public void insert () {
        if (powerForEuro != null) {
            powerForEuro.insert();
            return;
        }

        if (powerForChina != null) {
            powerForChina.insert();
            return;
        }
    }
}
