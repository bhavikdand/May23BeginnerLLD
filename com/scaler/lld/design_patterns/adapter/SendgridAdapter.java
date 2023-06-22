package com.scaler.lld.design_patterns.adapter;

import com.scaler.lld.design_patterns.adapter.libraries.Sendgrid;

public class SendgridAdapter implements EmailServiceAdapter{

    Sendgrid api;

    public SendgridAdapter() {
        this.api = new Sendgrid("API_KEY");
    }

    @Override
    public void sendEmail(String from, String to, String content) {
        this.api.sendEmail(from, new String[]{to}, content, new String[]{}, new String[]{});
    }
}
