package com.kutuphane.services;

public class ValidationUtil {
    private static int emailKontrolSayisi = 0;
//static 
    public static boolean isEmailValid(String email) {
        emailKontrolSayisi++;
        return email != null && email.contains("@");
    }

    public static int getEmailKontrolSayisi() {
        return emailKontrolSayisi;
    }
}
