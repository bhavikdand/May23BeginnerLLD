package com.scaler.lld.design_patterns.factory;

public interface FlutterFactory {

    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();
}

class AndroidFlutterFactory implements FlutterFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}

class IosFlutterFactory implements FlutterFactory{

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
