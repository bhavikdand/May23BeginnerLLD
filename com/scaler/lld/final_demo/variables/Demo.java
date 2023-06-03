package com.scaler.lld.final_demo.variables;

public class Demo {

    public static void main(String[] args) {

        final int i;
        i = 2;

        System.out.println(i);

        // i= 4;  <- Not allowed cause the variable is final

        final int j = 5;
//        j = 10;
    }
}

class Animal{
    final String name;
    final int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

//    public void setName(String name){
//        this.name = name;   <- Value cannot be set since, name is final
//    }

}
