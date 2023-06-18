package com.oop_3;

public class MySQLManager extends DBManager {
    public MySQLManager () {
    }

    public void DBRegister () {
        System.out.println("MySQLManager: Registering MySQL driver...");
    }

    public void DBConnect () {
        System.out.println("MySQLManager: Connecting to MySQL database...");
    }
}
