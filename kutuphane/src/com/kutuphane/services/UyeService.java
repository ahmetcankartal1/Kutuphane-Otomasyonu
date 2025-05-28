package com.kutuphane.services;

import com.kutuphane.services.CrudIslemleri; 
import com.kutuphane.db.DbConnection;
import com.kutuphane.models.Uye;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * UyeService – artık dışarıdaki ValidationUtil yerine
 * statik bir helper metot içeriyor.
 */
public class UyeService implements CrudIslemleri<Uye> {

    //  Inner Class 
    private class AdresDetayi {
        private final String sehir;
        private final String mahalle;
        AdresDetayi(String sehir, String mahalle) {
            this.sehir   = sehir;
            this.mahalle = mahalle;
        }
        @Override
        public String toString() {
            return sehir + " / " + mahalle;
        }
    }
   public boolean uyeEkle(Uye uye) throws Exception {
        ekle(uye);
        return true;
    }
      public Uye uyeAra(int uyeNo) throws Exception {
        return ara(uyeNo);
    }
   public boolean uyeSil(int uyeNo) throws Exception {
        sil(uyeNo);
        return true;
    }
    
    // ─── Static Helper (eski ValidationUtil yerine) 
    private static int emailCheckCount = 0;
    private static boolean isEmailValid(String email) {
        emailCheckCount++;
        return email != null && email.contains("@");
    }
    public static int getEmailCheckCount() { return emailCheckCount; }

    // Ekle
    @Override
    public void ekle(Uye uye) throws Exception {
        if (!isEmailValid(uye.getEmail())) {
            throw new IllegalArgumentException("Geçersiz e-posta adresi.");
        }
        String sql = "INSERT INTO Uyeler(Ad,Soyad,Email,Cinsiyet,KayitTarihi) VALUES(?,?,?,?,GETDATE())";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, uye.getAd());
            ps.setString(2, uye.getSoyad());
            ps.setString(3, uye.getEmail());
            ps.setString(4, uye.getCinsiyet());
            ps.executeUpdate();
        }
    }

    // Overloading: log opsiyonlu versiyon 
    public void ekle(Uye uye, boolean logla) throws Exception {
        ekle(uye);
        if (logla) {
            System.out.println("[LOG] Üye eklendi: " + uye.getAd() + " " + uye.getSoyad());
        }
    }

    //  Listele
    @Override
    public List<Uye> listele() throws Exception {
        List<Uye> list = new ArrayList<>();
        String sql = "SELECT * FROM Uyeler";
        try (Connection c = DbConnection.getConnection();
             Statement st = c.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Uye u = new Uye(
                    rs.getString("Ad"),
                    rs.getString("Soyad"),
                    rs.getString("Email"),
                    rs.getString("Cinsiyet")
                );
                u.setUyeID(rs.getInt("UyeID"));
                u.setKayitTarihi(rs.getDate("KayitTarihi"));
                list.add(u);
            }
        }
        return list;
    }

    // Ara
    @Override
    public Uye ara(int id) throws Exception {
        String sql = "SELECT * FROM Uyeler WHERE UyeID = ?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Uye u = new Uye(
                        rs.getString("Ad"),
                        rs.getString("Soyad"),
                        rs.getString("Email"),
                        rs.getString("Cinsiyet")
                    );
                    u.setUyeID(rs.getInt("UyeID"));
                    u.setKayitTarihi(rs.getDate("KayitTarihi"));
                    return u;
                }
            }
        }
        return null;
    }

    
    @Override
    public void guncelle(Uye uye) throws Exception {
        String sql = "UPDATE Uyeler SET Ad=?,Soyad=?,Email=?,Cinsiyet=? WHERE UyeID=?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, uye.getAd());
            ps.setString(2, uye.getSoyad());
            ps.setString(3, uye.getEmail());
            ps.setString(4, uye.getCinsiyet());
            ps.setInt(5, uye.getUyeID());
          ps.executeUpdate();
       }
   }

    //  Sil 
    @Override
    public void sil(int id) throws Exception {
        String sql = "DELETE FROM Uyeler WHERE UyeID = ?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    // ─── Inner Class
    /** Üyenin Sehir/Mahalle bilgisini getiriyor */
    public String getAdresDetayi(int uyeID) throws Exception {
        String sql = "SELECT Sehir, Mahalle FROM Uyeler WHERE UyeID = ?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, uyeID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    AdresDetayi ad = new AdresDetayi(rs.getString("Sehir"), rs.getString("Mahalle"));
                    return ad.toString();
                }
            }
        }
        return "Adres Bulunamadı";
    }
}
