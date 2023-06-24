package com.oop_4;

// The type ChinesePowerSupply must 
// implement the inherited abstract method PowerSupply.extract()

// The type ChinesePowerSupply must 
// implement the inherited abstract method PowerSupply.insert()
public class ChinesePowerSupply extends PowerSupply {

    public ChinesePowerSupply () {
    }

    public ChinesePowerSupply (String category) {
        // 调用抽象类的构造方法
        super(category);
    }

    public void insert () {
        System.out.println("用三角扁形插头插入插座");
    }

    public void extract () {
        System.out.println("从三角扁形插座中拔出");
    }
}
