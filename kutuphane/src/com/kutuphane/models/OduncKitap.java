package com.kutuphane.models;

import java.util.Date;

public class OduncKitap {
    private int    oduncID;
    private int    uyeID;
    private String isbn;
    private Date   oduncTarihi;
    private Date   iadeTarihi;
    private int    durum;      // 1=ödünç, 0=iade

    public OduncKitap(int uyeID, String isbn) {
        this.uyeID     = uyeID;
        this.isbn      = isbn;
        this.durum     = 1;
    }

    // Getter/Setter
    public int getUyeID() { return uyeID; }
    public String getIsbn() { return isbn; }
}
