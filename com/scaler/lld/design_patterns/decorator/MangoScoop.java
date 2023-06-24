package com.scaler.lld.design_patterns.decorator;

public class MangoScoop extends IngredientsDecorator{

    public MangoScoop(Ingredients baseIcecream) {
        super(baseIcecream);
    }

    @Override
    public int getCost() {
        return baseIcecream.getCost() + 50;
    }
}
