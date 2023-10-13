package com.Exception;

import java.util.InputMismatchException;

public class InputTypeException extends InputMismatchException {
    public InputTypeException () {
        super();
    }

    public InputTypeException (String message) {
        super(message);
    }
}
