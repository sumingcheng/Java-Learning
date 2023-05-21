package com.oop;

/**
 * 成员变量
 *    1. 类中直接进行定义
 *    2. 存储在堆内存中
 *    3. 跟随对象一起创建和销毁
 *    4. 有默认初始化值(系统默认值或者手动初始化)
 *    
 * 局部变量
 *    1. 方法的参数或方法中定义的变量
 *    2. 存储在栈内存中（引用地址或基本类型的值）
 *    3. 根据方法开始执行以及执行完毕一起创建与销毁
 *    4. 没有默认初始化值的
 *
 */

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HandPhone handPhone = new HandPhone();
        
//        handPhone.setBrand("iPhone");
//        handPhone.setColor("绿色");
//        handPhone.setPrice(700);
        
        handPhone.setBrand("华为");
        handPhone.setColor("白色");
        handPhone.setPrice(8988);
        
        System.out.println(handPhone.getBrand()); // null
        System.out.println(handPhone.getColor()); // null
        System.out.println(handPhone.getPrice()); // 0
        handPhone.test();
	}

}
