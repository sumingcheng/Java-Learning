package com.DesignPattern.adapter;

/*
 * 适配器模式
 * 为了解决两个不兼容的接口之间的兼容问题
 * 适配器更多是未来后续的补充，让主函数的逻辑减少，虽然可以使用重载来实现，但是重载的方式不够灵活，而且代码冗余，代码也可能会更多
 * */
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
