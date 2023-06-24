package com.scaler.lld.design_patterns.decorator;

public abstract class IngredientsDecorator implements Ingredients {
    Ingredients baseIcecream;

    public IngredientsDecorator(Ingredients baseIcecream) {
        this.baseIcecream = baseIcecream;
    }
}
