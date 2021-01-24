
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class cekran extends javax.swing.JDialog {
//tablo üzerinde işlemler yapmak için ...
    DefaultTableModel model ;
    //burada veritabanı işelemleri gerçekleştireceğim için 
    CalisanIslemleri islemler = new CalisanIslemleri();
    public cekran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model =(DefaultTableModel) calısantablosu.getModel();
        calısanGoruntüle();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calısantablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adalanı = new javax.swing.JTextField();
        departmanalanı = new javax.swing.JTextField();
        soyadalanı = new javax.swing.JTextField();
        maasalanı = new javax.swing.JTextField();
        mesaj_yazısı2 = new javax.swing.JLabel();
        calısanekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        calısantablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad", "Soyad", "Departman", "MAAŞ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calısantablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calısantablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calısantablosu);
        if (calısantablosu.getColumnModel().getColumnCount() > 0) {
            calısantablosu.getColumnModel().getColumn(0).setResizable(false);
            calısantablosu.getColumnModel().getColumn(1).setResizable(false);
            calısantablosu.getColumnModel().getColumn(2).setResizable(false);
            calısantablosu.getColumnModel().getColumn(3).setResizable(false);
            calısantablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("AD");

        jLabel2.setText("SOYAD");

        jLabel3.setText("DEPARTMAN");

        jLabel4.setText("MAAŞ");

        mesaj_yazısı2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mesaj_yazısı2.setForeground(new java.awt.Color(153, 0, 0));

        calısanekle.setText("YENİ ÇALIŞAN EKLE");
        calısanekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calısanekleActionPerformed(evt);
            }
        });

        guncelle.setText("Çalışan Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Çalışan Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(arama_cubugu)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesaj_yazısı2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(departmanalanı, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(soyadalanı, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(maasalanı, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adalanı, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(calısanekle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adalanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calısanekle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(soyadalanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncelle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(departmanalanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maasalanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mesaj_yazısı2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        calısantablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        // TODO add your handling code here:
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void calısanekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calısanekleActionPerformed
        // TODO add your handling code here:
        mesaj_yazısı2.setText("");
        String ad = adalanı.getText();
        String soyad = soyadalanı.getText();
        String departman = departmanalanı.getText();
        String maas = maasalanı.getText();
        
        islemler.calisanEkle(ad, soyad, departman, maas);
        calısanGoruntüle();
        mesaj_yazısı2.setText("Yeni Çalışan Başarı ile eklendi");
    }//GEN-LAST:event_calısanekleActionPerformed

    private void calısantablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calısantablosuMouseClicked
        // TODO add your handling code here:
        int selectedrow = calısantablosu.getSelectedRow();
        adalanı.setText(model.getValueAt(selectedrow, 1).toString());
        soyadalanı.setText(model.getValueAt(selectedrow, 2).toString());
        departmanalanı.setText(model.getValueAt(selectedrow, 3).toString());
        maasalanı.setText(model.getValueAt(selectedrow, 4).toString());
        
        
    }//GEN-LAST:event_calısantablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        // TODO add your handling code here:
        String ad = adalanı.getText();
        String soyad = soyadalanı.getText();
        String departman = departmanalanı.getText();
        String maas = maasalanı.getText();
        int selectedrow =calısantablosu.getSelectedRow();
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazısı2.setText("Çalışanlar Tablosu şuanda Boş");
            }else{
                mesaj_yazısı2.setText("Lütfen güncellenecek bir çalışan seçin");
            }
        }else{
            int id = (int)model.getValueAt(selectedrow, 0);
            
            
            islemler.calisanGuncelle(id, soyad, soyad, departman, maas);
            calısanGoruntüle();
            mesaj_yazısı2.setText("Çalışan başarıyla güncellendi");
        }
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        // TODO add your handling code here:
        mesaj_yazısı2.setText("");
        int selectedRow = calısantablosu.getSelectedRow();
         if(selectedRow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazısı2.setText("Çalışanlar Tablosu şuanda Boş");
            }else{
                mesaj_yazısı2.setText("Lütfen silinecek bir çalışan seçin");
            }
        }else{
             int id =(int) model.getValueAt(selectedRow, 0);
             islemler.calisanSil(id);
             calısanGoruntüle();
             mesaj_yazısı2.setText("Çalışan Başarı ile Silindi....");
         }
    }//GEN-LAST:event_silActionPerformed

public void calısanGoruntüle(){
    //bu metod içerisinde tablomu doldurmaya çalışıcam
    //bu metodun direkt olarak costructor içinde çalışmasını istiyorum.Çünkü bir yapı çağrıldığında ilk constructor devreye girer
    //ilk başta tablomu sıfırlamam(Boşaltmam) gerekiyor
    model.setRowCount(0);//çalıaşn tablom bu yapım saytesinde sıfırlanmış olacak 
    ArrayList<Calisan> calısanlar = new ArrayList<Calisan>();
    
    
    calısanlar = islemler.calisanlariGetir();//bu yapı benim için bir arraylist dönecek ve ben bu yapıyı listeme eklicem
    if(calısanlar !=null){
        for(Calisan calisan :calısanlar){
            Object[] eklenecek = {calisan.getId(),calisan.getAd(),calisan.getSoyad(),calisan.getDepartman(),calisan.getMaas()};
            model.addRow(eklenecek);
        }
    }
            

}
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
            java.util.logging.Logger.getLogger(cekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cekran dialog = new cekran(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adalanı;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calısanekle;
    private javax.swing.JTable calısantablosu;
    private javax.swing.JTextField departmanalanı;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maasalanı;
    private javax.swing.JLabel mesaj_yazısı2;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyadalanı;
    // End of variables declaration//GEN-END:variables
}
