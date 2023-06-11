package com.oop_2;

public class Woman extends Person {
    private boolean isBirthBearing = false;
    private String husbandName;

    public void setBirthBearing (boolean birthBearing) {
        isBirthBearing = birthBearing;
    }

    public boolean getBirthBearing () {
        return isBirthBearing;
    }

    public String getHusbandName () {
        return husbandName;
    }

    public void setHusbandName (String husbandName) {
        this.husbandName = husbandName;
    }

    public void testWoman () {
        testPerson();
        System.out.println(height);
    }
}
