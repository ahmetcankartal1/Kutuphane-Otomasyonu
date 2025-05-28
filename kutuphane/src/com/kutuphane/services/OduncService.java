package com.kutuphane.services;

import com.kutuphane.db.DbConnection;
import com.kutuphane.models.OduncKitap;
import java.sql.*;

public class OduncService {

    public boolean oduncVer(int uyeNo, String isbn) throws SQLException {
        String sql = "INSERT INTO OduncKitap(UyeID,ISBN,OduncTarihi,Durum) "
                   + "VALUES(?,?,GETDATE(),1)";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, uyeNo);
            ps.setString(2, isbn);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean kitapGeriAl(int uyeNo, String isbn) throws SQLException {
        String sql = "UPDATE OduncKitap SET IadeTarihi = GETDATE(), Durum = 0 "
                   + "WHERE UyeID = ? AND ISBN = ? AND Durum = 1";
        try (Connection c = DbConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, uyeNo);
            ps.setString(2, isbn);
            return ps.executeUpdate() > 0;
        }
    }
}
