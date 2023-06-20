package com.scaler.lld.design_patterns.factory;

public interface Menu {

    void renderMenu();
}

class AndroidMenu implements Menu{
    @Override
    public void renderMenu() {
        System.out.println("Android menu is rendering");
    }
}

class IosMenu implements Menu{
    @Override
    public void renderMenu() {
        System.out.println("Ios menu is rendering");
    }
}
