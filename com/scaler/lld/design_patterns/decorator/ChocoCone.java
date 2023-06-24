package com.scaler.lld.design_patterns.decorator;

public class ChocoCone implements Ingredients{
    Ingredients baseIcecream;
    public ChocoCone() {
    }

    public ChocoCone(Ingredients baseIcecream){
        this.baseIcecream = baseIcecream;
    }

    @Override
    public int getCost() {
        if(baseIcecream != null){
           return baseIcecream.getCost() + 30;
        }
        return 30;
    }
}
