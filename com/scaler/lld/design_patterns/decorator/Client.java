package com.scaler.lld.design_patterns.decorator;

public class Client {

    public static void main(String[] args) {
        Ingredients icecream = new ChocoChips(new MangoScoop(new ChocoCone(new ChocoCone())));
        System.out.println(icecream.getCost());
    }
}
