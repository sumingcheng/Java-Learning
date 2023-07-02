package com.DesignPattern.strategy;

public class UsernameSign implements IUserSign {
    @Override
    public void login(String account, String password) {
         if (account.length() < 6) {
             System.out.println("账户不能小于6位");
             return;
         }

         if (password.length() < 6) {
             System.out.println("密码不能小于6位");
             return;
         }

         System.out.println("登录成功");
    }

    @Override
    public void register(String account, String password) {

    }
}
