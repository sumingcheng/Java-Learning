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
//        Printer<Integer, String> integerPrinter = new Printer<>(100, "Hello World!");
//        integerPrinter.print();
//
//        Printer<String, Number> stringPrinter = new Printer<>("Hello World!", 1);
//        String res = stringPrinter.print();
//        System.out.println(res);
//
//        boolean isEqual = stringPrinter.myEquals("Hello World!");
//        System.out.println(isEqual);
//
//        NumberPrinter<Integer> numberPrinter = new NumberPrinter<>(100);
//        numberPrinter.print();
//
//        NumberPrinter<Double> numberPrinter1 = new NumberPrinter<>(100.0);
//        numberPrinter1.print();
//
//        NumberPrinter<Float> numberPrinter2 = new NumberPrinter<>(100.0f);
//        numberPrinter2.print();

//        MyTest myTest = new MyTest(100);
//        myTest.printType();
//
//        MyTest myTest1 = new MyTest("Hello World!");
//        myTest1.printType();


//        Child<String> child = new Child<>("Hello World!");
//        System.out.printf("child.getName(): %s\n", child.getName());
//        child.setName("admin");
//        System.out.printf("child.getName(): %s\n", child.getName());
//
//        Child<Integer> child1 = new Child<>(100);
//        System.out.printf("child1.getName(): %d\n", child1.getName());
//        child1.setName(101);
//        System.out.printf("child1.getName(): %d\n", child1.getName());

//        IPrinter<String> stringPrinter = new PrinterImpl<>();
//        stringPrinter.print("Hello, world!");
//
//        IPrinter<Integer> integerPrinter = new PrinterImpl<>();
//        integerPrinter.print(12345);

//        GenericMethod genericMethod = new GenericMethod();
//        boolean isEqual = genericMethod.myEquals("Hello World", "Hello World!");
//        System.out.println(isEqual);

//        GenericMethod.getType(1, "2", 3.0, 4, 5);


        MyTools<Integer> myTools = new MyTools<>(100);
        getInfo(myTools);
    }

    public static void getInfo (MyTools<?> myTools) {
        myTools.getType();
    }
}
