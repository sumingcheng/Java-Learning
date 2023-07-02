package com.DesignPattern.strategy;
import java.util.Scanner;

abstract class UserSign {
    // private IUserSign iUserSign;
    private Scanner scanner = new Scanner(System.in);
    public UserSign () {}

//    public void setStrategy (IUserSign iUserSign) {
//        this.iUserSign = iUserSign;
//    }

    public void login (IUserSign iUserSign) {
        // this.iUserSign = iUserSign;

        System.out.println("请输入账号：");
        String account = scanner.next();

        System.out.println("请输入验证码：");
        String passcode = scanner.next();

        iUserSign.login(account, passcode);
    }

    public void register () {

    }
}
