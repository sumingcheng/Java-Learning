package com.Generics;

public class Test {
    public static void main (String[] args) {
//        IntegerPrinter integerPrinter = new IntegerPrinter(100);
//        integerPrinter.print();
//
//        StringPrinter stringPrinter = new StringPrinter("Hello World!");
//        stringPrinter.print();

//        ObjectPrinter objectPrinter = new ObjectPrinter(100);
//        objectPrinter.print();
//
//        ObjectPrinter objectPrinter1 = new ObjectPrinter("Hello World!");
//        objectPrinter1.print();

        // 泛型里面只能放引用类型，不能放基本类型
        Printer<Integer, String> integerPrinter = new Printer<>(100, "Hello World!");
        integerPrinter.print();

        Printer<String, Number> stringPrinter = new Printer<>("Hello World!", 1);
        String res = stringPrinter.print();
        System.out.println(res);

        boolean isEqual = stringPrinter.myEquals("Hello World!");
        System.out.println(isEqual);

        NumberPrinter<Integer> numberPrinter = new NumberPrinter<>(100);
        numberPrinter.print();

        NumberPrinter<Double> numberPrinter1 = new NumberPrinter<>(100.0);
        numberPrinter1.print();

        NumberPrinter<Float> numberPrinter2 = new NumberPrinter<>(100.0f);
        numberPrinter2.print();
    }
}
