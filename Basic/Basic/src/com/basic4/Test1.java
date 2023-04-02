package com.basic4;

public class Test1 {
    public static void main(String[] args) {
//        int a = 1, b = 2;
//
//        float c = 3.14f;
//        int d = 2;
//        boolean e = true;
//        String h = "Hello World";
//        // 字符串 拼接
//        System.out.printf(h + c + d + e); // Hello World3.142true

//        int a = 10;
//        char c = 'b';
//
//        System.out.println(a * c);

//        int a = 20, b = 8;
//        // 运算时使用 float 会自动转换为 float,因为 float 范围大于 int
//        System.out.println((float) a / b); // 2.5
//        System.out.println(a % b); // 4

//        System.out.println(10 / 0);

//        System.out.println(1.0 / 0); // Infinity
//        System.out.println(-1.0 / 0); // -Infinity
//        /*
//         * 运算过程
//         * 1.0 / 0
//         * 1.0 / 0.0 有小数，所以转换为 float
//         * 1.0 / 0.0f 0.0 趋向左，趋向0，所以结果是 Infinity
//         * 1.0 是整数部分，为 1
//         * */

        /*
         * 不确定数，不定型极限，洛必达法则
         * 0.0 / 0
         * 0.0 / 0.0 有小数，所以转换为 float
         * 这种情况下，分子趋向于 0，分母趋向于 0，不能确定谁能更快的趋向于 0，所以结果是不确定的
         * 所以结果是 NaN
         * */
//        System.out.println(0.0 / 0); // NaN
//        System.out.println(-0.0 / 0); // NaN

        int a = 1;
        // 先执行，后运算
        System.out.println(a++);
        // 先运算，后执行
        System.out.println(++a);


    }
}
