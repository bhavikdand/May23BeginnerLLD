package com.scaler.lld.design_patterns.factory;

public interface Button {

    void renderButton();
}

class AndroidButton implements Button{

    @Override
    public void renderButton() {
        System.out.println("Android button is rendering");
    }
}

class IosButton implements Button{

    @Override
    public void renderButton() {
        System.out.println("IosButton is rendering");
    }
}
