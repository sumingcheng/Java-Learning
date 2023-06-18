package com.oop_3;

public class Female extends Human {
    public Female () {

    }

    public Female (String name) {
        super(name);
    }

    public void eat () {
        System.out.println("Female eats");
    }

    public void sleep () {
        System.out.println("Female sleeps");
    }

    public void work () {
        System.out.println("Female works");
    }

    public void travel () {
        System.out.println("Female travels");
    }

}
