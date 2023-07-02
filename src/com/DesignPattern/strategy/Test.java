package com.DesignPattern.strategy;

/**
 * 两种登录
 * 主要的功能：登录 -> 2种登录策略
 *   1. 用户名和密码
 *   2. 手机号和验证码
 *
 * 接口 -> 规范了需要实现的用户登录注册的方法实现
 *   1. 登录的抽象
 *   2. 注册的抽象
 *
 * 不同的登录注册 -> 不同的策略
 *   1. 用户名密码
 *   2. 手机号和验证码
 *
 * 抽象类 -> 调用接口的抽象方法
 * 业务类 -> 继承抽象类 -> login -> 业务类实例化时传入的具体策略
 *     1. 用户名密码的策略类
 *     2. 手机号验证码的策略类
 *
 */

public class Test {
    public static void main (String[] args) {
         UserController user = new UserController();
         // user.setStrategy(new MobilePhoneNumberSign());
         // user.login(new MobilePhoneNumberSign());
        user.login(new UsernameSign());
    }
}
