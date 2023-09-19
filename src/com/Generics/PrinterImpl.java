    package com.Generics;

    public class PrinterImpl<T> implements IPrinter<T> {
        @Override
        public void print(T item) {
            System.out.println("Type: " + item.getClass().getSimpleName() + ", Value: " + item);
        }
    }
