package com.scaler.lld.strings;

public class Demo {

    public static void main(String[] args) {
        String a = "Bhavik";
        String b = "Bhavik";
        String s = new String("Bhavik");
        System.out.println(s);

        a = "Scaler";
        System.out.println(b);

        b += ",hello!";
        System.out.println(b);
    }
}
