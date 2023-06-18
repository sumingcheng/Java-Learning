package com.oop_3;

public abstract class DBManager {
    protected abstract void DBRegister ();

    protected abstract void DBConnect ();

    protected void DBOperation () {
        DBRegister();
        DBConnect();
    }

}
