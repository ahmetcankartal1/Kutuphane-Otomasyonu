package com.kutuphane.ui;


import com.kutuphane.services.UyeService;
import com.kutuphane.services.KitapService;
import com.kutuphane.services.OduncService;
import com.kutuphane.models.Uye;
import com.kutuphane.models.Kitap;
import com.kutuphane.models.OduncKitap;   
import java.sql.SQLException;
import javax.swing.JOptionPane;




import javax.swing.JOptionPane;


public class Mainframe extends javax.swing.JFrame {

   
    public Mainframe() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblad = new javax.swing.JLabel();
        lblsoyad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        txtsoyad = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        rberkek = new javax.swing.JRadioButton();
        rbkadın = new javax.swing.JRadioButton();
        lblcinsiyet = new javax.swing.JLabel();
        btnkaydet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblUyeNo = new javax.swing.JLabel();
        txtUyeNo = new javax.swing.JTextField();
        btnUyeAra = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblÜyeNoSil = new javax.swing.JLabel();
        txtUyeSil = new javax.swing.JTextField();
        btnÜyeSil = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtÜyeOdunc = new javax.swing.JTextField();
        txtKitapOduncIsbnNo = new javax.swing.JTextField();
        btnodunc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtKitapAdi = new javax.swing.JTextField();
        txtYazar = new javax.swing.JTextField();
        txtSayfaSayısı = new javax.swing.JTextField();
        txtTürKitap = new javax.swing.JTextField();
        txtYayınEvi = new javax.swing.JTextField();
        txtBasimYili = new javax.swing.JTextField();
        txtKitapAdetEkle = new javax.swing.JTextField();
        txtIsbnKitapEkle = new javax.swing.JTextField();
        btnKitapEkle = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIsbnKitapSil = new javax.swing.JTextField();
        txtAdetKitapSil = new javax.swing.JTextField();
        btnKitapSil = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtIsbnKitapAra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnara = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtUyeNoGeriAl = new javax.swing.JTextField();
        txtIsbnUyeGeriAl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGeriAl = new javax.swing.JButton();
        spnPuan = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtYorum = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblad.setText("Ad :");

        lblsoyad.setText("Soyad :");

        jLabel3.setText("Email :");

        rberkek.setText("Erkek");

        rbkadın.setText("Kadın");
        rbkadın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbkadınActionPerformed(evt);
            }
        });

        lblcinsiyet.setText("Cinsiyet :");

        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblcinsiyet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnkaydet)
                            .addComponent(rberkek, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbkadın, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblad)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblsoyad))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rberkek)
                    .addComponent(rbkadın)
                    .addComponent(lblcinsiyet))
                .addGap(38, 38, 38)
                .addComponent(btnkaydet)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        tabs.addTab("Üye Ekle", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblUyeNo.setText("Üye No :");

        btnUyeAra.setText("Üye Ara");
        btnUyeAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeAraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(lblUyeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUyeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnUyeAra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUyeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUyeNo))
                .addGap(40, 40, 40)
                .addComponent(btnUyeAra)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        tabs.addTab("Üye Ara", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblÜyeNoSil.setText("Üye No :");

        btnÜyeSil.setText("Sil");
        btnÜyeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÜyeSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(lblÜyeNoSil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnÜyeSil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblÜyeNoSil)
                    .addComponent(txtUyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnÜyeSil)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        tabs.addTab("Üye Sil", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Üye No :");

        jLabel4.setText("ISBN No :");

        btnodunc.setText("Ödünç Ver");
        btnodunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoduncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKitapOduncIsbnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtÜyeOdunc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnodunc)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtÜyeOdunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKitapOduncIsbnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnodunc)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        tabs.addTab("Ödünç Verme", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Kitap Adı :");

        jLabel7.setText("Adet :");

        jLabel8.setText("Türü :");

        jLabel9.setText("Yayın Evi :");

        jLabel10.setText("Basım Yılı :");

        jLabel11.setText("Yazar :");

        jLabel12.setText("Sayfa Sayısı :");

        jLabel13.setText("ISBN No :");

        txtYazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYazarActionPerformed(evt);
            }
        });

        btnKitapEkle.setText("Ekle");
        btnKitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitapEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel8))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIsbnKitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSayfaSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYazar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTürKitap, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYayınEvi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBasimYili, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKitapAdetEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnKitapEkle)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtKitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(txtSayfaSayısı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTürKitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYayınEvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBasimYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKitapAdetEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbnKitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKitapEkle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Kitap Ekle", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setText("ISBN No :");

        jLabel17.setText("Adet :");

        btnKitapSil.setText("Sil");
        btnKitapSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKitapSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdetKitapSil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbnKitapSil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnKitapSil)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(txtIsbnKitapSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtAdetKitapSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnKitapSil)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tabs.addTab("Kitap Sil", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        txtIsbnKitapAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnKitapAraActionPerformed(evt);
            }
        });

        jLabel5.setText("ISBN No :");

        btnara.setText("Ara");
        btnara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIsbnKitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnara)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbnKitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addComponent(btnara)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        tabs.addTab("Kitap Ara", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("Üye No :");

        jLabel15.setText("ISBN No :");

        btnGeriAl.setText("Geri Al");
        btnGeriAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriAlActionPerformed(evt);
            }
        });

        spnPuan.setMaximumSize(new java.awt.Dimension(5, 5));
        spnPuan.setMinimumSize(new java.awt.Dimension(1, 1));

        jLabel18.setText("Kitap Puanlama (1-5) :");

        txtYorum.setColumns(20);
        txtYorum.setRows(5);
        jScrollPane1.setViewportView(txtYorum);

        jLabel19.setText("Yorum :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnGeriAl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUyeNoGeriAl, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(txtIsbnUyeGeriAl, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(spnPuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUyeNoGeriAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIsbnUyeGeriAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnGeriAl)
                .addGap(48, 48, 48))
        );

        tabs.addTab("Kitap Geri Alma", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbkadınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbkadınActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbkadınActionPerformed

    private void txtIsbnKitapAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnKitapAraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnKitapAraActionPerformed

    private void btnaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaraActionPerformed
        String isbn = txtIsbnKitapAra.getText().trim();
    if(isbn.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ISBN girin!");
        return;
    }
    try {
        Kitap k = new KitapService().kitapAra(isbn);
        if(k!=null) {
            String msg = String.format(
              "ISBN: %s\nBaşlık: %s\nYazar: %s\nTürID: %d\nSayfa: %d\nYayınevi: %s\nBasım: %d\nAdet: %d",
              k.getIsbn(), k.getBaslik(), k.getYazar(),
              k.getTurID(), k.getSayfaSayisi(),
              k.getYayinEvi(), k.getBasimYili(), k.getAdet()
            );
            JOptionPane.showMessageDialog(this, msg, "Kitap Bulundu", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Kitap bulunamadı.");
        }
    } catch(SQLException ex) {
        JOptionPane.showMessageDialog(this, "DB hatası:\n"+ex.getMessage(),
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnaraActionPerformed

    private void txtYazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYazarActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
  
String ad      = txtad.getText().trim();
String soyad   = txtsoyad.getText().trim();
String email   = txtemail.getText().trim();
String cinsiyet = rberkek.isSelected() ? "E" : "K";
if (ad.isEmpty() || soyad.isEmpty() || email.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun.");
    return;
}

Uye uye = new Uye(ad, soyad, email, cinsiyet);
try {
    // void dönen metotu çağırıyoruz:
    new UyeService().ekle(uye);

    // Buraya geldiği anda hata atılmamış demektir:
    JOptionPane.showMessageDialog(this, "Üye eklendi.");

    // Formu temizleyelim:
    txtad.setText("");
    txtsoyad.setText("");
    txtemail.setText("");
    rberkek.setSelected(true);
} catch (Exception ex) {
    // Hangi istisna olursa olsun yakalayıp mesaj gösterelim:
    JOptionPane.showMessageDialog(this, "Eklenemedi: " + ex.getMessage());
}

    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btnKitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitapEkleActionPerformed
       try {
        String isbn        = txtIsbnKitapEkle.getText().trim();
        String baslik      = txtKitapAdi.getText().trim();
        String yazar       = txtYazar.getText().trim();
        int    turID       = Integer.parseInt(txtTürKitap.getText().trim());
        int    sayfa       = Integer.parseInt(txtSayfaSayısı.getText().trim());
        String yayinEvi    = txtYayınEvi.getText().trim();
        int    yil         = Integer.parseInt(txtBasimYili.getText().trim());
        int    adet        = Integer.parseInt(txtKitapAdetEkle.getText().trim());

        if(isbn.isEmpty()||baslik.isEmpty()||yazar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Gerekli alanlar boş bırakılamaz!");
            return;
        }

        Kitap k = new Kitap(isbn, baslik, yazar, turID, sayfa, yayinEvi, yil, adet);
        boolean ok = new KitapService().kitapEkle(k);
        JOptionPane.showMessageDialog(this, ok ? "Kitap eklendi." : "Eklenemedi.");
        if(ok) {
            txtIsbnKitapEkle.setText("");
            txtKitapAdi.setText("");
            txtYazar.setText("");
            txtTürKitap.setText("");
            txtSayfaSayısı.setText("");
            txtYayınEvi.setText("");
            txtBasimYili.setText("");
            txtKitapAdetEkle.setText("");
        }
    } catch(NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Sayı alanlarına sadece rakam girin!", 
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    } catch(SQLException ex) {
        JOptionPane.showMessageDialog(this, "DB hatası:\n"+ex.getMessage(),
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnKitapEkleActionPerformed

    private void btnKitapSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKitapSilActionPerformed
        String isbn = txtIsbnKitapSil.getText().trim();
    String adText = txtAdetKitapSil.getText().trim();
    if(isbn.isEmpty() || adText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ISBN ve Adet girin!");
        return;
    }
    try {
        int adet = Integer.parseInt(adText);
        boolean ok = new KitapService().kitapSil(isbn, adet);
        JOptionPane.showMessageDialog(this, ok ? "Adet düşürüldü." : "Başarısız!");
        if(ok) {
            txtIsbnKitapSil.setText("");
            txtAdetKitapSil.setText("");
        }
    } catch(NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Adet sayısal olmalı!", 
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    } catch(SQLException ex) {
        JOptionPane.showMessageDialog(this, "DB hatası:\n"+ex.getMessage(),
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnKitapSilActionPerformed

    private void btnoduncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoduncActionPerformed
         try {
        int uyeNo = Integer.parseInt(txtÜyeOdunc.getText().trim());
        String isbn = txtKitapOduncIsbnNo.getText().trim();
        if(isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ISBN girin!");
            return;
        }
        boolean ok = new OduncService().oduncVer(uyeNo, isbn);
        JOptionPane.showMessageDialog(this, ok ? "Kitap ödünç verildi." : "Başarısız!");
        if(ok) {
            txtÜyeOdunc.setText("");
            txtKitapOduncIsbnNo.setText("");
        }
    } catch(NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Üye No sayısal olmalı!", 
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    } catch(SQLException ex) {
        JOptionPane.showMessageDialog(this, "DB hatası:\n"+ex.getMessage(),
                                      "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnoduncActionPerformed

    private void btnGeriAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriAlActionPerformed
     try {
        int uyeNo = Integer.parseInt(txtUyeNoGeriAl.getText().trim());
        String isbn = txtIsbnUyeGeriAl.getText().trim();
        int puan = (Integer) spnPuan.getValue();
        String yorum = txtYorum.getText().trim();   // Yeni satır

        if (isbn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ISBN girin!",
                "Eksik Bilgi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 1) Kitabı iade et
        boolean ok = new OduncService().kitapGeriAl(uyeNo, isbn);
        if (!ok) {
            JOptionPane.showMessageDialog(this, "İade başarısız!",
                "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 2) Puan ve yorumu kaydet
        boolean puanOk = new KitapService().puanVeYorumKaydet(uyeNo, isbn, puan, yorum);

        // 3) Mesaj oluştur
        String mesaj;
        if (puanOk) {
            mesaj = String.format("İade tamamlandı.%nPuanınız: %d%nYorum: %s",
                                   puan, yorum.isEmpty() ? "(yok)" : yorum);
        } else {
            mesaj = "İade tamamlandı, ancak puan/yorum kaydedilemedi.";
        }

        JOptionPane.showMessageDialog(this, mesaj,
            "İşlem Tamam", JOptionPane.INFORMATION_MESSAGE);

        // 4) Alanları temizle
        txtUyeNoGeriAl.setText("");
        txtIsbnUyeGeriAl.setText("");
        spnPuan.setValue(1);
        txtYorum.setText("");

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this,
            "Üye No rakam olmalı!", "Geçersiz Girdi",
            JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this,
            "DB hatası:\n" + ex.getMessage(),
            "Hata", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGeriAlActionPerformed

    private void btnÜyeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÜyeSilActionPerformed
   
         // 1) Kullanıcıdan ID al
    String noText = txtUyeSil.getText().trim();

    try {
        // 2) ID’yi parse et (var da kullanabilirsiniz)
        int uyeNo = Integer.parseInt(noText);
        // — veya —
        // var uyeNo = Integer.parseInt(noText);

        // 3) Onay sor
        int secim = JOptionPane.showConfirmDialog(
            this,
            "Bu üyeyi gerçekten silmek istiyor musunuz?",
            "Silme Onayı",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        if (secim != JOptionPane.YES_OPTION) {
            return;
        }

        // 4) Servisi çağır (throws Exception)
        new UyeService().sil(uyeNo);  // artık void, hata fırlatırsa catch’e gider

        // 5) Başarı mesajı
        JOptionPane.showMessageDialog(
            this,
            "Üye silindi.",
            "Başarılı",
            JOptionPane.INFORMATION_MESSAGE
        );
        txtUyeSil.setText("");

    } catch (NumberFormatException ex) {
        // parseInt hatası
        JOptionPane.showMessageDialog(
            this,
            "Üye No yalnızca rakamlardan oluşmalıdır.",
            "Geçersiz Girdi",
            JOptionPane.ERROR_MESSAGE
        );
    } catch (Exception ex) {
        // servis veya veritabanı hataları
        JOptionPane.showMessageDialog(
            this,
            "Silme sırasında hata oluştu:\n" + ex.getMessage(),
            "Hata",
            JOptionPane.ERROR_MESSAGE
        );
    }
        
    }//GEN-LAST:event_btnÜyeSilActionPerformed

    private void btnUyeAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeAraActionPerformed
       // 1) Kullanıcının girdiği metni al
    String noText = txtUyeNo.getText().trim();

    try {
        // 2) String’i sayıya çevir
        int uyeNo = Integer.parseInt(noText);
        // (var da kullanabilirsiniz: var uyeNo = Integer.parseInt(noText);)

        // 3) Servisi çağır (throws Exception)
        UyeService svc = new UyeService();
        Uye u = svc.ara(uyeNo);

        // 4) Sonucu göster
        if (u != null) {
            String msg = String.format(
                "ID: %d\nAd: %s\nSoyad: %s\nEmail: %s\nCinsiyet: %s\nKayıt: %s",
                u.getUyeID(), u.getAd(), u.getSoyad(),
                u.getEmail(), u.getCinsiyet(),
                u.getKayitTarihi()
            );
            JOptionPane.showMessageDialog(this, msg, "Üye Bulundu", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Üye bulunamadı.", "Sonuç Yok", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (NumberFormatException ex) {
        // parseInt başarısızsa buraya girer
        JOptionPane.showMessageDialog(this,
            "Üye No yalnızca rakamlardan oluşmalıdır.",
            "Geçersiz Girdi",
            JOptionPane.ERROR_MESSAGE
        );
    } catch (Exception ex) {
        // svc.ara() veya veritabanı hataları buraya düşer
        JOptionPane.showMessageDialog(this,
            "Arama sırasında hata oluştu:\n" + ex.getMessage(),
            "Hata",
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnUyeAraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeriAl;
    private javax.swing.JButton btnKitapEkle;
    private javax.swing.JButton btnKitapSil;
    private javax.swing.JButton btnUyeAra;
    private javax.swing.JButton btnara;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnodunc;
    private javax.swing.JButton btnÜyeSil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUyeNo;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lblcinsiyet;
    private javax.swing.JLabel lblsoyad;
    private javax.swing.JLabel lblÜyeNoSil;
    private javax.swing.JRadioButton rberkek;
    private javax.swing.JRadioButton rbkadın;
    private javax.swing.JSpinner spnPuan;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField txtAdetKitapSil;
    private javax.swing.JTextField txtBasimYili;
    private javax.swing.JTextField txtIsbnKitapAra;
    private javax.swing.JTextField txtIsbnKitapEkle;
    private javax.swing.JTextField txtIsbnKitapSil;
    private javax.swing.JTextField txtIsbnUyeGeriAl;
    private javax.swing.JTextField txtKitapAdetEkle;
    private javax.swing.JTextField txtKitapAdi;
    private javax.swing.JTextField txtKitapOduncIsbnNo;
    private javax.swing.JTextField txtSayfaSayısı;
    private javax.swing.JTextField txtTürKitap;
    private javax.swing.JTextField txtUyeNo;
    private javax.swing.JTextField txtUyeNoGeriAl;
    private javax.swing.JTextField txtUyeSil;
    private javax.swing.JTextField txtYayınEvi;
    private javax.swing.JTextField txtYazar;
    private javax.swing.JTextArea txtYorum;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txtÜyeOdunc;
    // End of variables declaration//GEN-END:variables
}
