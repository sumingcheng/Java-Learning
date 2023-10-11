package com.Exception;

public class Logger {
    private int a;
    private int b;

    private int res;
    private Exception exception;

    public Logger (int a, int b, int res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }

    public Logger (int a, int b, Exception exception) {
        this.a = a;
        this.b = b;
        this.exception = exception;
    }

    public int getA () {
        return a;
    }

    public void setA (int a) {
        this.a = a;
    }

    public int getB () {
        return b;
    }

    public void setB (int b) {
        this.b = b;
    }

    public int getRes () {
        return res;
    }

    public void setRes (int res) {
        this.res = res;
    }

    public Exception getException () {
        return exception;
    }

    public void setException (Exception exception) {
        this.exception = exception;
    }

    @Override
    public String toString () {
        return "Logger{" +
                "a=" + a +
                ", b=" + b +
                ", res=" + res +
                ", exception=" + exception +
                '}';
    }
}
