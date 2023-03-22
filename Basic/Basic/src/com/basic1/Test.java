package com.basic1;

/*
 * Identifiers 标识符
 * 规则:
 * 1. 只能由字母、数字、下划线、$符号组成
 * 2. 不能以数字开头
 * 3. 不能是Java中的关键字、保留字
 * 4. 语意完整清晰
 * 5. 区分大小写
 * 6. 驼峰命名法
 * 7. 类名首字母大写
 * 8. 方法名首字母小写
 * 9. 变量名首字母小写
 * 10. 不允许有空格
 * 11. 不允许有中文
 */

/*
 * 类型定义
 * int 整型
 * 类修饰符 class
 * 访问控制修饰符
 * public 公共的
 * public 公共的
 * private 私有的
 * protected 受保护的
 * default 默认的
 * static 静态的
 * final 最终的
 * abstract 抽象的
 * synchronized 同步的
 * native 本地的
 * strictfp 严格的
 * transient 瞬态的
 * volatile 可变的
 * 访问关键字
 * this
 * 操作关键字
 * new
 */

public class Test {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.a);
        System.out.println(test1.getB());
        System.out.println(test1.getContent());
    }
}
