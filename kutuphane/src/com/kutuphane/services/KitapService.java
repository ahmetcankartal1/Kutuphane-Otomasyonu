package com.kutuphane.services;

import com.kutuphane.db.DbConnection;
import com.kutuphane.models.Kitap;
import java.sql.*;

public class KitapService {
    
    
    

    public boolean kitapEkle(Kitap k) throws SQLException {
        String sql = "INSERT INTO Kitaplar(ISBN,Baslik,Yazar,TurID,SayfaSayisi,YayinEvi,BasimYili,Adet) "
                   + "VALUES(?,?,?,?,?,?,?,?)";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, k.getIsbn());
            ps.setString(2, k.getBaslik());
            ps.setString(3, k.getYazar());
            ps.setInt(4, k.getTurID());
            ps.setInt(5, k.getSayfaSayisi());
            ps.setString(6, k.getYayinEvi());
            ps.setInt(7, k.getBasimYili());
            ps.setInt(8, k.getAdet());
            return ps.executeUpdate() > 0;
        }
    }

    public Kitap kitapAra(String isbn) throws SQLException {
        String sql = "SELECT * FROM Kitaplar WHERE ISBN = ?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, isbn);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Kitap k = new Kitap(
                      rs.getString("ISBN"),
                      rs.getString("Baslik"),
                      rs.getString("Yazar"),
                      rs.getInt("TurID"),
                      rs.getInt("SayfaSayisi"),
                      rs.getString("YayinEvi"),
                      rs.getInt("BasimYili"),
                      rs.getInt("Adet")
                    );
                    return k;
                }
            }
        }
        return null;
    }

    public boolean kitapSil(String isbn, int adet) throws SQLException {
        // Mevcut adeti azaltmak yerine tamamen silmek isterseniz DELETE kullanabilirsiniz.
        String sql = "UPDATE Kitaplar SET Adet = Adet - ? WHERE ISBN = ? AND Adet >= ?";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, adet);
            ps.setString(2, isbn);
            ps.setInt(3, adet);
            return ps.executeUpdate() > 0;
        }
    }
  public boolean puanVeYorumKaydet(int uyeNo, String isbn, int puan, String yorum) throws SQLException {
    String sql =
      "INSERT INTO KitapOneriPuan (UyeID, ISBN, Puan, Yorum, Tarih) " +
      "VALUES (?,     ?,    ?,    ?,     GETDATE())";
    try (Connection c = DbConnection.getConnection();
         PreparedStatement ps = c.prepareStatement(sql)) {
        ps.setInt(1, uyeNo);
        ps.setString(2, isbn);
        ps.setInt(3, puan);
        ps.setString(4, yorum);
        return ps.executeUpdate() > 0;
    }
}}
