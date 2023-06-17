package com.scaler.lld.design_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    // Make this singleton

    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student prototype){
        map.put(key, prototype);
    }

    public Student get(String key){
        return map.get(key);
    }
}
