package com.oop;

/**
 * this关键字和类的关系是什么？
 * 1. 调用构造方法构造对象 - 实例化对象
 * 2. this在哪里使用？类的成员方法里使用
 * 3. 成员方法是什么时候调用？实例化结束后，通过实例对象进行调用
 * 4. this在什么时候使用？成员方法执行的时候进行使用
 * 
 * 调用构造方法
 * 1. 执行构造方法
 * 2. 先创建实例对象
 * 3. 使用this -> 实例对象
 * 
 * this: 在类当中指代实例对象的一个工具
 *       在方法执行的时候代码中的this会访问实例对象
 *       
 * 1. this关键字是指代实例对象的工具
 * 2. this在类中可以访问成员变量
 * 3. this在类中可以调用成员方法以及构造方法
 * 4. 通过类名.this.xxx访问属性或者调用方法
 */

public class Test7 {

	public static void main(String[] args) {
		MyClasses myClasses = new MyClasses("JAVA班", "前端班");
		
		myClasses.getJavaClass();
		myClasses.getFrontendClass();
		// myClasses.formatInfo();
		
		myClasses.findJavaAndFrontendStudents();
	}

}
