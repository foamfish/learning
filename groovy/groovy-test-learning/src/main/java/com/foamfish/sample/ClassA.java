package com.foamfish.sample;

public class ClassA {

    public String functionA(String arg) {
        String returnValue = null;
        if (arg == "A") {
            returnValue = "A";
        } else if (arg == "B") {
            returnValue = "B";
        } else if (arg == "C") {
            returnValue = "C";
        } else {
            throw new IllegalArgumentException("error argument.");
        }
        return  returnValue;
    }

    private void functionOthers(){

    }
}
