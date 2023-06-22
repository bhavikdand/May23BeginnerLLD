package com.scaler.lld.design_patterns.adapter;

public interface EmailServiceAdapter {

    public void sendEmail(String from, String to, String content);
}
