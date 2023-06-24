package com.scaler.lld.design_patterns.decorator;

public class ChocoChips extends IngredientsDecorator{

    public ChocoChips(Ingredients baseIcecream) {
        super(baseIcecream);
    }

    @Override
    public int getCost() {
        return baseIcecream.getCost() + 15;
    }
}
