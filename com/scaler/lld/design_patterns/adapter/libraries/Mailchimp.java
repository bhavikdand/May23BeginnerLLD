package com.scaler.lld.design_patterns.adapter.libraries;

public class Mailchimp {

    private String apiKey;

    public Mailchimp(String apiKey) {
        this.apiKey = apiKey;
    }

    public void sendEmailAsync(String from, String[] to, String content, String[] cc, String[] bcc){
        // Code to create a thread and send email from it
        System.out.println("Sending email asynchronously using Mailchimp");
    }
}
