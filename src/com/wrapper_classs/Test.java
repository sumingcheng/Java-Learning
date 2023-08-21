package com.wrapper_classs;

public class Test {
    public static void main (String[] args) {
        // 包装类的静态方法
        // 十进制转二进制
        String str = Integer.toString(100, 2);
        System.out.println(str);

        int str2 = Integer.parseInt("100", 2);
        System.out.println(str2);

        // 把1包装成整型对象
        // 自动包装
        Integer a1 = 1;
        Integer a2 = 1;
        System.out.println(a1 == a2); // true  相同引用

        // 手动包装
        Integer a3 = new Integer(2);
        Integer a4 = new Integer(2);
        System.out.println(a3 == a4); // false
        System.out.println(a3.equals(a4)); // true

        // 自动包装
        Integer a5 = 128;
        Integer a6 = 128;
        System.out.println(a5 == a6); // false


        /*
         * 自动包装到底是怎么包装的呢？
         * 答案：调用了Integer.valueOf方法
         * IntegerCache.low = -128
         * IntegerCache.high = 127
         * 所以 -128 ~ 127 之间的数自动包装的时候会直接从缓存中获取
         * 这么做是为了给常使用的数字进行性能优化，内存使用效率
         * */
        Integer a7 = Integer.valueOf(127);
        Integer a8 = Integer.valueOf(127);

        Integer a9 = Integer.valueOf(1);
        Integer a10 = Integer.valueOf(1);
        System.out.println(a7 == a8); // true
        System.out.println(a9 == a10); // true

//        public static Integer valueOf(int i) {
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//            return new Integer(i);
//        }
    }
}
