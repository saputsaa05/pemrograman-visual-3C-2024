/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author natas
 */
public class SistemPembayaranSPP extends javax.swing.JFrame {
     // HashMap untuk menyimpan status pembayaran tiap bulan
    private HashMap<String, Boolean> statusPembayaran = new LinkedHashMap<>();
    private DefaultTableModel tableModel;
    
    /**
     * Creates new form SistemPembayaranSPP
     */
    public SistemPembayaranSPP() {
        initComponents();
        // Inisialisasi status pembayaran setiap bulan
        statusPembayaran = new HashMap<>();
        statusPembayaran.put("Januari", false);
        statusPembayaran.put("Februari", false);
        statusPembayaran.put("Maret", false);
        statusPembayaran.put("April", false);
        statusPembayaran.put("Mei", false);
        statusPembayaran.put("Juni", false);
        statusPembayaran.put("Juli", false);
        statusPembayaran.put("Agustus", false);
        statusPembayaran.put("September", false);
        statusPembayaran.put("Oktober", false);
        statusPembayaran.put("November", false);
        statusPembayaran.put("Desember", false);
        
        // Inisialisasi JTable dan model
        // Deklarasi JTable dan DefaultTableModel
        // Dalam konstruktor PembayaranSPP
         tableModel = new DefaultTableModel(new String[]{"Nama", "Bulan", "Jumlah Pembayaran", "Status"}, 0);
         taRiwayat.setModel(tableModel); // Menghubungkan tableModel dengan JTable (taRiwayat)

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnStatus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        lbJumlahSPP = new javax.swing.JLabel();
        lbBulan = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfJumlahSPP = new javax.swing.JTextField();
        cbFebruari = new javax.swing.JCheckBox();
        cbMaret = new javax.swing.JCheckBox();
        cbApril = new javax.swing.JCheckBox();
        cbMei = new javax.swing.JCheckBox();
        cbJanuari = new javax.swing.JCheckBox();
        cbJuni = new javax.swing.JCheckBox();
        cbJuli = new javax.swing.JCheckBox();
        cbAgustus = new javax.swing.JCheckBox();
        cbSeptember = new javax.swing.JCheckBox();
        cbOktober = new javax.swing.JCheckBox();
        cbNovember = new javax.swing.JCheckBox();
        cbDesember = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taRiwayat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbtotalbayar = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taBulan = new javax.swing.JTextArea();
        lbBelumBayar = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(219, 219, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStatus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStatus.setForeground(new java.awt.Color(102, 102, 0));
        btnStatus.setText("Status ");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        jPanel2.add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, -1));

        btnKeluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(102, 102, 0));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 100, -1));

        btnBayar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(102, 102, 0));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(245, 253, 245));
        jPanel5.setPreferredSize(new java.awt.Dimension(700, 300));
        jPanel5.setLayout(new java.awt.GridLayout());

        jPanel4.setBackground(new java.awt.Color(219, 219, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Pembayaran SPP");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 30));

        lbNama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNama.setForeground(new java.awt.Color(102, 102, 0));
        lbNama.setText("Nama :");
        jPanel4.add(lbNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 70, 50, -1));

        lbJumlahSPP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbJumlahSPP.setForeground(new java.awt.Color(102, 102, 0));
        lbJumlahSPP.setText("SPP per bulan :");
        jPanel4.add(lbJumlahSPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 20));

        lbBulan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbBulan.setForeground(new java.awt.Color(102, 102, 0));
        lbBulan.setText("Bulan  :");
        jPanel4.add(lbBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        tfNama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(tfNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 227, -1));

        tfJumlahSPP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel4.add(tfJumlahSPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 227, -1));

        cbFebruari.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbFebruari.setText("Februari");
        cbFebruari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFebruariActionPerformed(evt);
            }
        });
        jPanel4.add(cbFebruari, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 80, -1));

        cbMaret.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbMaret.setText("Maret");
        cbMaret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaretActionPerformed(evt);
            }
        });
        jPanel4.add(cbMaret, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, -1));

        cbApril.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbApril.setText("April");
        jPanel4.add(cbApril, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 70, -1));

        cbMei.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbMei.setText("Mei");
        jPanel4.add(cbMei, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 70, -1));

        cbJanuari.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbJanuari.setText("Januari");
        jPanel4.add(cbJanuari, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, -1));

        cbJuni.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbJuni.setText("Juni");
        jPanel4.add(cbJuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 85, -1));

        cbJuli.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbJuli.setText("Juli");
        cbJuli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJuliActionPerformed(evt);
            }
        });
        jPanel4.add(cbJuli, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, -1));

        cbAgustus.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbAgustus.setText("Oktober");
        jPanel4.add(cbAgustus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 85, -1));

        cbSeptember.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbSeptember.setText("Agustus");
        jPanel4.add(cbSeptember, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 70, -1));

        cbOktober.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbOktober.setText("November");
        jPanel4.add(cbOktober, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 80, -1));

        cbNovember.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbNovember.setText("September");
        cbNovember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNovemberActionPerformed(evt);
            }
        });
        jPanel4.add(cbNovember, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 91, -1));

        cbDesember.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cbDesember.setText("Desember");
        jPanel4.add(cbDesember, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 91, -1));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul3/icons8-school-64.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        btnHitung.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHitung.setForeground(new java.awt.Color(102, 102, 0));
        btnHitung.setText("Hitung Pembayaran");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        jPanel4.add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jPanel5.add(jPanel4);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(245, 245, 214));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        taRiwayat.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        taRiwayat.setForeground(new java.awt.Color(102, 102, 0));
        taRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Bulan", "Jumlah Pembayaran", "Status"
            }
        ));
        taRiwayat.setGridColor(new java.awt.Color(225, 225, 239));
        jScrollPane3.setViewportView(taRiwayat);

        jPanel3.add(jScrollPane3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtotalbayar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbtotalbayar.setText("Total Pembayaran  :");
        jPanel1.add(lbtotalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbTotal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbTotal.setText("Total  Yang Harus Dibayar :");
        jPanel1.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        taBulan.setColumns(20);
        taBulan.setLineWrap(true);
        taBulan.setRows(3);
        taBulan.setTabSize(10);
        taBulan.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taBulan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbBelumBayar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbBelumBayar.setText("Bulan yang belum dibayar: ");
        jPanel1.add(lbBelumBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbStatus.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        lbStatus.setText("Status :");
        jPanel1.add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   // Method untuk cek status siswa apakah menunggak atau lunas
    private void cekStatusSiswa() {
        boolean adaTunggakan = false;
        StringBuilder tunggakan = new StringBuilder();
        int totalTunggakan = 0; // Inisialisasi total tunggakan

        // Cek apakah ada bulan yang belum dibayar
        for (String bulan : statusPembayaran.keySet()) {
            if (!statusPembayaran.get(bulan)) {
                adaTunggakan = true;
                tunggakan.append(bulan).append(", ");
                totalTunggakan += Integer.parseInt(tfJumlahSPP.getText()); // Tambah jumlah SPP ke total
            }
        }

        // Menentukan status berdasarkan tunggakan
        if (adaTunggakan) {
                lbStatus.setText("Status: Menunggak");
                lbBelumBayar.setText("Bulan yang belum dibayar: ");
                taBulan.setText(tunggakan.toString());
                lbTotal.setText("Total yang harus dibayar: Rp " + totalTunggakan);
        } else {
            lbStatus.setText("Status: Lunas");
            taBulan.setText(""); // Hapus isi JTextArea jika tidak ada tunggakan
            lbTotal.setText("Total yang harus dibayar: Rp 0");
   
        }
    }
    
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    int totalPembayaran = 0;
        String inputSPP = tfJumlahSPP.getText();

        try {
            int jumlahSPP = Integer.parseInt(tfJumlahSPP.getText()); 

            if (cbJanuari.isSelected()) totalPembayaran += jumlahSPP;
            if (cbFebruari.isSelected()) totalPembayaran += jumlahSPP;
            if (cbMaret.isSelected()) totalPembayaran += jumlahSPP;
            if (cbApril.isSelected()) totalPembayaran += jumlahSPP;
            if (cbMei.isSelected()) totalPembayaran += jumlahSPP;
            if (cbJuni.isSelected()) totalPembayaran += jumlahSPP;
            if (cbJuli.isSelected()) totalPembayaran += jumlahSPP;
            if (cbAgustus.isSelected()) totalPembayaran += jumlahSPP;
            if (cbSeptember.isSelected()) totalPembayaran += jumlahSPP;
            if (cbOktober.isSelected()) totalPembayaran += jumlahSPP;
            if (cbNovember.isSelected()) totalPembayaran += jumlahSPP;
            if (cbDesember.isSelected()) totalPembayaran += jumlahSPP;

            lbtotalbayar.setText("Total Pembayaran: Rp " + totalPembayaran);
            cekStatusSiswa();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah SPP yang valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }

    }//GEN-LAST:event_btnHitungActionPerformed

    
    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // Kosongkan tabel sebelum menambahkan data baru
        tableModel.setRowCount(0); // Mengosongkan semua data dalam tabel

        // Daftar bulan dalam urutan yang diinginkan
        String[] bulanUrut = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        // Iterasi melalui bulan secara urut
        for (String bulan : bulanUrut) {
            if (statusPembayaran.containsKey(bulan)) {
                String statusBulan = statusPembayaran.get(bulan) ? "Lunas" : "Belum Dibayar";

                // Tambahkan baris baru ke tabel untuk setiap bulan
                tableModel.addRow(new Object[]{
                    tfNama.getText(),  // Nama siswa
                    bulan,             // Nama bulan
                    "Rp " + tfJumlahSPP.getText(),  // Jumlah pembayaran
                    statusBulan        // Status pembayaran (Lunas/Belum Dibayar)
                });
            }
        }

        // Menampilkan pesan informasi kepada pengguna bahwa status telah diperbarui
        JOptionPane.showMessageDialog(this, "Status pembayaran diperbarui!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbFebruariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFebruariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFebruariActionPerformed

    private void cbMaretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaretActionPerformed

    private void cbJuliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJuliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJuliActionPerformed

    private void cbNovemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNovemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNovemberActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        String namaSiswa = tfNama.getText();
        StringBuilder bulanPembayaran = new StringBuilder(); // Menggunakan StringBuilder untuk menyimpan bulan
        // Tambahkan data ke tableModel

        // Perbarui status pembayaran berdasarkan checkbox yang dipilih
        if (cbJanuari.isSelected()) {
            bulanPembayaran.append("Januari, ");
            statusPembayaran.put("Januari", true);
            cbJanuari.setEnabled(false); // Disable checkbox Januari
        }
        if (cbFebruari.isSelected()) {
            bulanPembayaran.append("Februari, ");
            statusPembayaran.put("Februari", true);
            cbFebruari.setEnabled(false); // Disable checkbox Februari
        }
        if (cbMaret.isSelected()) {
            bulanPembayaran.append("Maret, ");
            statusPembayaran.put("Maret", true);
            cbMaret.setEnabled(false); // Disable checkbox Maret
        }
        if (cbApril.isSelected()) {
            bulanPembayaran.append("April, ");
            statusPembayaran.put("April", true);
            cbApril.setEnabled(false);
        }
        if (cbMei.isSelected()) {
            bulanPembayaran.append("Mei, ");
            statusPembayaran.put("Mei", true);
            cbMei.setEnabled(false);
        }
        if (cbJuni.isSelected()) {
            bulanPembayaran.append("Juni, ");
            statusPembayaran.put("Juni", true);
            cbJuni.setEnabled(false);
        }
        if (cbJuli.isSelected()) {
            bulanPembayaran.append("Juli, ");
            statusPembayaran.put("Juli", true);
            cbJuli.setEnabled(false);
        }
        if (cbAgustus.isSelected()) {
            bulanPembayaran.append("Agustus, ");
            statusPembayaran.put("Agustus", true);
            cbAgustus.setEnabled(false);
        }
        if (cbSeptember.isSelected()) {
            bulanPembayaran.append("September, ");
            statusPembayaran.put("September", true);
            cbSeptember.setEnabled(false);
        }
        if (cbOktober.isSelected()) {
            bulanPembayaran.append("Oktober, ");
            statusPembayaran.put("Oktober", true);
            cbOktober.setEnabled(false);
        }
        if (cbNovember.isSelected()) {
            bulanPembayaran.append("November, ");
            statusPembayaran.put("November", true);
            cbNovember.setEnabled(false);
        }
        if (cbDesember.isSelected()) {
            bulanPembayaran.append("Desember, ");
            statusPembayaran.put("Desember", true);
            cbDesember.setEnabled(false);
        }

        // Hapus koma dan spasi terakhir dari bulanPembayaran
        if (bulanPembayaran.length() > 0) {
            bulanPembayaran.setLength(bulanPembayaran.length() - 2);
        }

        // Pastikan ada minimal satu bulan yang dipilih
        if (bulanPembayaran.length() > 0) {
            // Tambahkan data ke tableModel
            tableModel.addRow(new Object[]{
                namaSiswa,
                bulanPembayaran.toString(),
                "Rp " + tfJumlahSPP.getText(),
                "Lunas"
            });

            // Tampilkan pesan sukses dan perbarui status label
            lbStatus.setText("Pembayaran berhasil!");
            JOptionPane.showMessageDialog(this, "Pembayaran berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Panggil metode untuk cek status siswa (misalnya menampilkan bulan yang belum dibayar)
            cekStatusSiswa();
        } else {
            // Jika tidak ada bulan yang dipilih, tampilkan peringatan
            JOptionPane.showMessageDialog(this, "Pilih minimal satu bulan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBayarActionPerformed

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
            java.util.logging.Logger.getLogger(SistemPembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemPembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemPembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemPembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemPembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnStatus;
    private javax.swing.JCheckBox cbAgustus;
    private javax.swing.JCheckBox cbApril;
    private javax.swing.JCheckBox cbDesember;
    private javax.swing.JCheckBox cbFebruari;
    private javax.swing.JCheckBox cbJanuari;
    private javax.swing.JCheckBox cbJuli;
    private javax.swing.JCheckBox cbJuni;
    private javax.swing.JCheckBox cbMaret;
    private javax.swing.JCheckBox cbMei;
    private javax.swing.JCheckBox cbNovember;
    private javax.swing.JCheckBox cbOktober;
    private javax.swing.JCheckBox cbSeptember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBelumBayar;
    private javax.swing.JLabel lbBulan;
    private javax.swing.JLabel lbJumlahSPP;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbtotalbayar;
    private javax.swing.JTextArea taBulan;
    private javax.swing.JTable taRiwayat;
    private javax.swing.JTextField tfJumlahSPP;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
