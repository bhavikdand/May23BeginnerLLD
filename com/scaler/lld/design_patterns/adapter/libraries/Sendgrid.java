package com.scaler.lld.design_patterns.adapter.libraries;

public class Sendgrid {
    private String apiKey;

    public Sendgrid(String apiKey) {
        this.apiKey = apiKey;
    }

    public void sendEmail(String from, String[] to, String content, String[] cc, String[] bcc){
        System.out.println("Sending email via sendgrid");
    }
}
