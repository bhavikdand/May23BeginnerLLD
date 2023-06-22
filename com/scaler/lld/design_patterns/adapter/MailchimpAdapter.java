package com.scaler.lld.design_patterns.adapter;

import com.scaler.lld.design_patterns.adapter.libraries.Mailchimp;

public class MailchimpAdapter implements EmailServiceAdapter{

    Mailchimp api;

    public MailchimpAdapter() {
        this.api = new Mailchimp("API_KEY");
    }

    @Override
    public void sendEmail(String from, String to, String content) {
        this.api.sendEmailAsync(from, new String[]{to}, content,
                new String[]{}, new String[]{});
    }
}
