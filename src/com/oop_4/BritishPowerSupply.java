package com.oop_4;

// The type BritishPowerSupply must implement 
// the inherited abstract method IChangePowerSupply.britishToChinese()
public class BritishPowerSupply extends PowerSupply implements IChangePowerSupply {
    public BritishPowerSupply () {
    }

    public BritishPowerSupply (String category) {
        super(category);
    }

    public void insert () {
        System.out.println("用三角圆形插头插入插座");
    }

    public void extract () {
        System.out.println("从三角圆形插座拔出");
    }

    public void britishToChinese () {
        System.out.println(britishCategory);
        System.out.println("需要使用圆形转扁形电源接口转换器");
    }
}
