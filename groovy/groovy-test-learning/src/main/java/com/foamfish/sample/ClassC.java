package com.foamfish.sample;

public class ClassC {

    public String functionC(String arg) {
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
