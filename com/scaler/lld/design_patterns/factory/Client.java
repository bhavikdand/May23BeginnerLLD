package com.scaler.lld.design_patterns.factory;

public class Client {

    public static void main(String[] args) {
        FlutterFactory flutterFactory = Flutter.createFlutterFactory(SupportedPlatforms.ANDROID);
        Button button = flutterFactory.createButton();
        button.renderButton();

        Menu menu = flutterFactory.createMenu();
        menu.renderMenu();
    }
}