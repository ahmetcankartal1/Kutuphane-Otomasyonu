package com.kutuphane.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    // “np:” prefix’i named pipes’ı işaret eder
    // AHMET-CAN\SQLEXPRESS instance’ınıza bağlanır
    private static final String URL =
        "jdbc:sqlserver://"
      + "localhost;"                  // yine localhost kullanıyoruz
      + "instanceName=SQLEXPRESS;"    // named instance
      + "networkProtocol=np;"         // **named pipes** için
      + "databaseName=KutupaneDB;"
      + "integratedSecurity=true;"
      + "encrypt=false;"
      + "trustServerCertificate=true";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}



