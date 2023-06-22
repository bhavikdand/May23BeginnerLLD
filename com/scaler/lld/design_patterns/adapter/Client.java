package com.scaler.lld.design_patterns.adapter;

public class Client {

    public static void main(String[] args) {
        EmailServiceAdapter adapter = new MailchimpAdapter();
        EmailHelper emailHelper = new EmailHelper(adapter);
        emailHelper.sendEmail("a","b","Hey");
    }
}
