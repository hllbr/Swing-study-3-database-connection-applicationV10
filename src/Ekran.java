
import java.awt.event.KeyEvent;


public class Ekran extends javax.swing.JFrame {
CalisanIslemleri islemler = new CalisanIslemleri();
//bu yapı içerisinde bulunan constructurum sayesinde veritabanı ile işlemlerimi yapabilicem

    public Ekran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcı_girdi = new javax.swing.JTextField();
        parola_girdi = new javax.swing.JPasswordField();
        gostergebuton = new javax.swing.JCheckBox();
        giris = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mesaj_yazısı = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Parola");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Kullanıcı Adı");

        kullanıcı_girdi.setBackground(new java.awt.Color(51, 255, 255));
        kullanıcı_girdi.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        kullanıcı_girdi.setForeground(new java.awt.Color(153, 0, 51));

        gostergebuton.setBackground(new java.awt.Color(204, 204, 255));
        gostergebuton.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        gostergebuton.setForeground(new java.awt.Color(0, 102, 102));
        gostergebuton.setText("?");
        gostergebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gostergebutonActionPerformed(evt);
            }
        });
        gostergebuton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gostergebutonKeyPressed(evt);
            }
        });

        giris.setText("GİRİŞ YAP");
        giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisActionPerformed(evt);
            }
        });
        giris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                girisKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kullanıcı_girdi, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gostergebuton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parola_girdi)
                            .addComponent(giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(kullanıcı_girdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(parola_girdi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giris, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gostergebuton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        mesaj_yazısı.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        mesaj_yazısı.setForeground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesaj_yazısı, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesaj_yazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gostergebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gostergebutonActionPerformed
        // TODO add your handling code here:
        if(gostergebuton.isSelected()){
            parola_girdi.setEchoChar((char)0);
        }else{
            parola_girdi.setEchoChar('*');
        }
    }//GEN-LAST:event_gostergebutonActionPerformed

    private void girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisActionPerformed
        mesaj_yazısı.setText("");
        
        String kullanıcıadı= kullanıcı_girdi.getText();
        
        String parola = new String(parola_girdi.getPassword());
        //burada aldığım bilgileri database de sorgulamam gerekiyor
        boolean girisbasarılı = islemler.girisYap(kullanıcıadı,parola);
        if(girisbasarılı == true){
            //giriş başarılı olduğunda başka birframe yada başka bir işleme geçiş yapıcam
           cekran ck = new cekran(this, true);
            setVisible(false);
            ck.setVisible(true);
            System.exit(0);
        }else{
            //eğer giriş başarılı değilse giriş yapan kişiye hatayı bildiren bir mesaj yayınlamam gerek
            mesaj_yazısı.setText("Giriş Işlemi Başarısız...!!!Lütfen Tekrar Deneyiniz");
        }
    }//GEN-LAST:event_girisActionPerformed

    private void girisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_girisKeyPressed
        // TODO add your handling code here:
        mesaj_yazısı.setText("");
        int c = evt.getKeyCode();
        String kullanıcıadı= kullanıcı_girdi.getText();
        String parola = new String(parola_girdi.getPassword());
        //burada aldığım bilgileri database de sorgulamam gerekiyor
        if(c == KeyEvent.VK_ENTER){
        boolean girisbasarılı = islemler.girisYap(kullanıcıadı,parola);
        if(girisbasarılı == true){
            //giriş başarılı olduğunda başka birframe yada başka bir işleme geçiş yapıcam
            mesaj_yazısı.setText("Griş Işlemi Başarılı");
        }else{
            //eğer giriş başarılı değilse giriş yapan kişiye hatayı bildiren bir mesaj yayınlamam gerek
            mesaj_yazısı.setText("Giriş Işlemi Başarısız...!!!Lütfen Tekrar Deneyiniz");
        } 
        }
    }//GEN-LAST:event_girisKeyPressed

    private void gostergebutonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gostergebutonKeyPressed
        // TODO add your handling code here:
       int d = evt.getKeyCode();
       if(d == KeyEvent.VK_ENTER){
            parola_girdi.setEchoChar((char)0);
       }else if(d ==KeyEvent.VK_DELETE){
           parola_girdi.setEchoChar('*');
       }
    }//GEN-LAST:event_gostergebutonKeyPressed

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
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris;
    private javax.swing.JCheckBox gostergebuton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kullanıcı_girdi;
    private javax.swing.JLabel mesaj_yazısı;
    private javax.swing.JPasswordField parola_girdi;
    // End of variables declaration//GEN-END:variables
}
