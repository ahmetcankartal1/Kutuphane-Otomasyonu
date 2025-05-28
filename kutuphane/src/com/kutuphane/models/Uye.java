package com.kutuphane.models;

import java.util.Date;

public class Uye {
    private int    uyeID;
    private String ad, soyad, email, cinsiyet;
    private Date   kayitTarihi;

    // Kayıt için yapıcı
    public Uye(String ad, String soyad, String email, String cinsiyet) {
        this.ad       = ad;
        this.soyad    = soyad;
        this.email    = email;
        this.cinsiyet = cinsiyet;
    }

    // Getter/Setter
    public int getUyeID() { return uyeID; }
    public void setUyeID(int id) { this.uyeID = id; }

    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public String getEmail() { return email; }
    public String getCinsiyet() { return cinsiyet; }

    public Date getKayitTarihi() { return kayitTarihi; }
    public void setKayitTarihi(Date tarih) { this.kayitTarihi = tarih; }
}
