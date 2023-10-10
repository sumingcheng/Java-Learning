package com.Generics.type_erasure;

//// Object 替换
//public class ErasureTest<T> {
//    private T value;
//
//    public ErasureTest (T value) {
//        this.value = value;
//    }
//
//    public T getValue () {
//        return value;
//    }
//
//    public void setValue (T value) {
//        this.value = value;
//    }
//}

// ——————————————————————————————————
// Number 替换
public class ErasureTest<T extends Number> {
    private T value;

    public ErasureTest (T value) {
        this.value = value;
    }

    public T getValue () {
        return value;
    }

    public void setValue (T value) {
        this.value = value;
    }
    // Number
    public <T extends Number> T getNumber (T number) {
        return number;
    }
}
