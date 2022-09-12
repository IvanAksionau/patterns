package com.ivan.practice.pattern.structuraldesign.facade.email;

public class Mailer {

    private static final Mailer MAILER = new Mailer();

    private Mailer() {

    }

    public static Mailer getMailer() {
        return MAILER;
    }

    public boolean send(Email email) {
        return true;
    }
}
