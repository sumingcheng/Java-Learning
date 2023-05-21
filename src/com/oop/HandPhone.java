package com.oop;

/**
 * public class - 公共的类
 * protected class - 受保护的类
 * private class - 私有类 -> 外部是肯定不能访问的
 *
 * 一个类 -> new -> 实例 -> 访问属性/调用方法
 *
 */
// private class： Illegal modifier for the class HandPhone; 
// only public, abstract & final are permitted
public class HandPhone {
	/**
	 * 成员变量：当前类中的属性
	 */
	private String brand;
	private String color;
	private int    price;

//	public HandPhone () {
////		PhoneUtil phoneUtil = new PhoneUtil();
////		System.out.println(phoneUtil.a);
//		// PhoneUtil.test();
//	}
	// 局部变量名与成员变量名一致的情况下，就近进行访问
	// 局部变量尽量不要和成员变量重复命名
	public void test () {
		// 局部变量
		int price;
		price = 30000;
		System.out.println(price);
		System.out.println(this.price);
	}
	/**
	 * 成员方法
	 *
	 * 1. 在成员方法内访问成员变量，可以不通过this进行访问
	 */
	public String getBrand () {
		// return this.brand;
		return brand;
	}

	// 2. 在成员方法内操作成员变量，必须先通过this访问成员变量
	public void setBrand (String brand) {
		if (PhoneUtil.checkBrand(brand)) {
			this.brand = brand;
		} else {
			System.out.println("不包含该手机品牌");
		}
	}

	public String getColor () {
		return color;
	}

	public void setColor (String color) {
		if (PhoneUtil.checkColor(color)) {
			this.color = color;
		} else {
			System.out.println("不包含该颜色");
		}
	}

	public int getPrice () {
		return price;
	}

	public void setPrice (int price) {
		if (PhoneUtil.checkPrice(price)) {
			this.price = price;
		} else {
			System.out.println("没有合法的价格范围内");
		}
	}

	// 内部类
	private static class PhoneUtil {
//		private static void test () {
//			System.out.println("Test");
//		}

		private static String[] phoneList = { "华为", "小米", "OPPO", "VIVO" };
		private static String[] colorList = { "白色", "黑色", "橙色" };

		public static boolean checkBrand (String brand) {
			// 局部变量：方法的参数与方法内部声明的变量
			for (String phoneBrand: phoneList) {
				if (phoneBrand == brand) {
					return true;
				}
			}

			return false;
		}

		public static boolean checkColor (String color) {
			for (String phoneColor: colorList) {
				if (phoneColor == color) {
					return true;
				}
			}

			return false;
		}

		public static boolean checkPrice (int price) {
			if (price > 20000 || price < 800) {
				return false;
			}

			return true;
		}
	}

}











