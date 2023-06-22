package com.scaler.lld.design_patterns.adapter;

public class EmailHelper {
    EmailServiceAdapter emailServiceAdapter;

    public EmailHelper(EmailServiceAdapter emailServiceAdapter) {
        this.emailServiceAdapter = emailServiceAdapter;
    }

    public void sendEmail(String from, String to, String content){
        this.emailServiceAdapter.sendEmail(from, to, content);
    }
}
