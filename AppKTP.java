package E_KTP;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import DATA.DataKTP;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class AppKTP extends javax.swing.JFrame {
    ArrayList<DataKTP> RT1 = new ArrayList<>();
    ArrayList<DataKTP> RT2 = new ArrayList<>();
    ArrayList<DataKTP> RT3 = new ArrayList<>();
    ArrayList<DataKTP> RT4 = new ArrayList<>();
    ArrayList<DataKTP> rt_1 = new ArrayList<>();
    ArrayList<DataKTP> rt_2 = new ArrayList<>();
    ArrayList<DataKTP> rt_3 = new ArrayList<>();
    ArrayList<DataKTP> rt_4 = new ArrayList<>();
    DefaultTableModel dm;
   
    public AppKTP() {
        setTitle("e-KTP");
        initComponents();
        BuatKolom();
        sort();
    }
    private void BuatKolom(){
      dm=(DefaultTableModel) jTable2.getModel();
      dm.addColumn("Nama");
      dm.addColumn("NIK");
      dm.addColumn("TTL");
      dm.addColumn("Alamat");
      dm.addColumn("JenisKelamin");
      dm.addColumn("RT/RW");
      dm.addColumn("KELURAHAN");          
      dm.addColumn("Agama");
      dm.addColumn("Status");
      dm.addColumn("Pekerjaan");
      dm.addColumn("Kewarganegaraan");    
      
     }
     private void search (String query){
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dm);
        jTable2.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        niktx = new javax.swing.JTextField();
        namatx = new javax.swing.JTextField();
        ttltx = new javax.swing.JTextField();
        almtx = new javax.swing.JTextField();
        jobtx = new javax.swing.JTextField();
        negaratx = new javax.swing.JTextField();
        agmtx = new javax.swing.JComboBox<>();
        stattx = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jktx = new javax.swing.JComboBox<>();
        Dau = new javax.swing.JRadioButton();
        LowokWaru = new javax.swing.JRadioButton();
        rt1 = new javax.swing.JRadioButton();
        rt2 = new javax.swing.JRadioButton();
        rt3 = new javax.swing.JRadioButton();
        rt4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        tampildata = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Lowok = new javax.swing.JRadioButton();
        dau = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Search = new javax.swing.JTextField();
        sortRt1 = new javax.swing.JRadioButton();
        sortRt2 = new javax.swing.JRadioButton();
        sortRt3 = new javax.swing.JRadioButton();
        sortRt4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NIK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("TTL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("RT/RW");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kel/Desa");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Agama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Status Perkawinan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pekerjaan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kewarganegaraan");

        agmtx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        agmtx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Lain-lain" }));
        agmtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agmtxActionPerformed(evt);
            }
        });

        stattx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stattx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Kawin", "Kawin", "Bercerai" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("DAFTAR E-KTP");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jktx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jktx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        buttonGroup3.add(Dau);
        Dau.setText("Dau");

        buttonGroup3.add(LowokWaru);
        LowokWaru.setText("Lowok Waru");

        buttonGroup2.add(rt1);
        rt1.setText("Rt. 01");

        buttonGroup2.add(rt2);
        rt2.setText("Rt. 02");

        buttonGroup2.add(rt3);
        rt3.setText("Rt. 03");

        buttonGroup2.add(rt4);
        rt4.setText("Rt. 04");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agmtx, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jktx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LowokWaru)
                                .addGap(18, 18, 18)
                                .addComponent(Dau))
                            .addComponent(almtx)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rt1)
                                .addGap(10, 10, 10)
                                .addComponent(rt2)
                                .addGap(18, 18, 18)
                                .addComponent(rt3)
                                .addGap(18, 18, 18)
                                .addComponent(rt4))
                            .addComponent(jLabel14)
                            .addComponent(niktx, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namatx, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttltx, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jobtx, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stattx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(negaratx, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(niktx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(namatx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ttltx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jktx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(almtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rt1)
                            .addComponent(rt3)
                            .addComponent(rt4)
                            .addComponent(rt2))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LowokWaru)
                            .addComponent(Dau))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agmtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stattx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negaratx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Data", jPanel3);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tampildata.setText("Tampilkan data");
        tampildata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampildataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("KELURAHAN");

        Lowok.setText("Lowok Waru");

        dau.setText("Dau");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        sortRt1.setText("Rt. 1");

        sortRt2.setText("Rt. 2");

        sortRt3.setText("Rt. 3");

        sortRt4.setText("Rt. 4");
        sortRt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortRt4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("RT");

        jLabel8.setText("Search");

        Del.setText("Remove");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tampildata)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(Lowok)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dau, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sortRt1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sortRt2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sortRt3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sortRt4)))
                                .addGap(10, 10, 10)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Del)
                        .addGap(270, 270, 270))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(tampildata))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sortRt4)
                                    .addComponent(sortRt3)
                                    .addComponent(sortRt2)
                                    .addComponent(sortRt1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Search)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lowok)
                                    .addComponent(dau))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Del)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tampilkan Data", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agmtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agmtxActionPerformed
       
    }//GEN-LAST:event_agmtxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DataKTP data = new DataKTP();
      data.setNIK(niktx.getText());
      data.setNama(namatx.getText());
      data.setTTL(ttltx.getText());
      data.setJkl((String)jktx.getSelectedItem());
      data.setAlamat(almtx.getText());      
      data.setAgama((String) agmtx.getSelectedItem());
      data.setStatus((String)stattx.getSelectedItem());
      data.setPekerjaan(jobtx.getText());
      data.setKewarganegaraan(negaratx.getText());
      if(LowokWaru.isSelected()){
          if(rt1.isSelected()){
              data.setDesa("Lowok Waru");
              data.setRt("1");
          RT1.add(data);
          }
          if(rt2.isSelected()){
              data.setDesa("Lowok Waru");
              data.setRt("2");
          RT2.add(data);
          }
          if(rt3.isSelected()){
              data.setDesa("Lowok Waru");
              data.setRt("3");
          RT3.add(data);
          }
          if(rt4.isSelected()){
              data.setDesa("Lowok Waru");
              data.setRt("4");
          RT4.add(data);
          }
      }
      if(Dau.isSelected()){
          if(rt1.isSelected()){
              data.setDesa("DAU");
              data.setRt("1");
          rt_1.add(data);
          }
          if(rt2.isSelected()){
              data.setDesa("DAU");
              data.setRt("2");
          rt_2.add(data);
          }
          if(rt3.isSelected()){
              data.setDesa("DAU");
              data.setRt("3");
          rt_3.add(data);
          }
          if(rt4.isSelected()){
              data.setDesa("DAU");
              data.setRt("4");
          rt_4.add(data);
          }
      }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void datakolom(String nama, String nik,String ttl, String alamat,  String jkl, String rt, String desa,String agama, String status, String pekerjaan, String kewarganegaraan){
        String[] rowData={nama, nik ,ttl,alamat,jkl,rt, desa,agama, status,  pekerjaan,  kewarganegaraan};
        dm.addRow(rowData);}
    private void tampildataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampildataActionPerformed
      if(Lowok.isSelected()){
            if(sortRt1.isSelected()){
            for (DataKTP isi :RT1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt2.isSelected()){
            for (DataKTP isi :RT2){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt3.isSelected()){
            for (DataKTP isi :RT3){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt4.isSelected()){
            for (DataKTP isi :RT4){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            }  
      if(Dau.isSelected()){
            if(sortRt1.isSelected()){
            for (DataKTP isi :rt_1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt2.isSelected()){
            for (DataKTP isi :rt_2){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt3.isSelected()){
            for (DataKTP isi :rt_3){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            if(sortRt4.isSelected()){
            for (DataKTP isi :rt_4){
            datakolom(isi.getNama(), isi.getNIK(),isi.getAlamat(), isi.getTTL(), isi.getJkl(), isi.getRt(), isi.getDesa(),isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }}
            }  
        
    }//GEN-LAST:event_tampildataActionPerformed

    private void sort(){
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dm);
        jTable2.setRowSorter(sorter);
    }
    private void sortRt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortRt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortRt4ActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
       dm.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_DelActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
         String query=Search.getText().toLowerCase();
        search(query);
    }//GEN-LAST:event_SearchActionPerformed
         
    
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
            java.util.logging.Logger.getLogger(AppKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppKTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppKTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Dau;
    private javax.swing.JButton Del;
    private javax.swing.JRadioButton Lowok;
    private javax.swing.JRadioButton LowokWaru;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> agmtx;
    private javax.swing.JTextField almtx;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton dau;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jktx;
    private javax.swing.JTextField jobtx;
    private javax.swing.JTextField namatx;
    private javax.swing.JTextField negaratx;
    private javax.swing.JTextField niktx;
    private javax.swing.JRadioButton rt1;
    private javax.swing.JRadioButton rt2;
    private javax.swing.JRadioButton rt3;
    private javax.swing.JRadioButton rt4;
    private javax.swing.JRadioButton sortRt1;
    private javax.swing.JRadioButton sortRt2;
    private javax.swing.JRadioButton sortRt3;
    private javax.swing.JRadioButton sortRt4;
    private javax.swing.JComboBox<String> stattx;
    private javax.swing.JButton tampildata;
    private javax.swing.JTextField ttltx;
    // End of variables declaration//GEN-END:variables
}
