package com.scaler.lld.wrapper_object_class;

public class WrapperClasses {

    public static void main(String[] args) {
        int num = 3;
        Integer wrappedNum = new Integer(3);
        System.out.println(wrappedNum.intValue());

        System.out.println("DEBUG");

        // Autoboxing
        int num1 = 35;
        Integer wrappedNum1 = num1; // Autoboxing
        int num2 = wrappedNum1; // Unboxing

        System.out.println("DEBUG");

        Integer i1 = new Integer(23);
        int i2 = Integer.parseInt("1");
        Boolean b = new Boolean(false);
        Character c = 'a';
        c.getClass();
        c.notify();
        c.toString();
    }
}
