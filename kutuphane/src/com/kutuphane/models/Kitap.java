package com.kutuphane.models;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private int turID;
    private int sayfaSayisi;
    private String yayinEvi;
    private int basimYili;
    private int adet;
//yapıcı metot
    public Kitap(String isbn, String baslik, String yazar,
                 int turID, int sayfaSayisi,
                 String yayinEvi, int basimYili, int adet) {
        this.isbn        = isbn;
        this.baslik      = baslik;
        this.yazar       = yazar;
        this.turID       = turID;
        this.sayfaSayisi = sayfaSayisi;
        this.yayinEvi    = yayinEvi;
        this.basimYili   = basimYili;
        this.adet        = adet;
    }

    // Getter ve Setter’lar
    public String getIsbn() { return isbn; }
    public String getBaslik() { return baslik; }
    public String getYazar() { return yazar; }
    public int    getTurID() { return turID; }
    public int    getSayfaSayisi() { return sayfaSayisi; }
    public String getYayinEvi() { return yayinEvi; }
    public int    getBasimYili() { return basimYili; }
    public int    getAdet() { return adet; }

    public void setAdet(int adet) { this.adet = adet; }
}
