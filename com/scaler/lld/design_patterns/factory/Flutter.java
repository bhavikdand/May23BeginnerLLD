package com.scaler.lld.design_patterns.factory;

public  class Flutter {



    public static FlutterFactory createFlutterFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidFlutterFactory();
        }
        else if(platform.equals(SupportedPlatforms.IOS)){
            return new IosFlutterFactory();
        }
        return null;
    }
}


