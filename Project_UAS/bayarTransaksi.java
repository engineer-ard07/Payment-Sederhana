/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_UAS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class bayarTransaksi extends javax.swing.JFrame {

    Model model = new Model();
    
    public bayarTransaksi() {
        initComponents();
        lb_nama.setText(bantuan.userName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_penerima = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        lb_nominal = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jLabel7 = new javax.swing.JLabel();
        lb_nama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(29, 28, 28));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(98, 82, 246));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BAYAR TRANSAKSI");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Praktikum Alpro\\Projek\\icons8_Account_50px.png")); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 50, 60));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Keterangan");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        lb_penerima.setBackground(new java.awt.Color(98, 82, 246));
        lb_penerima.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lb_penerima.setForeground(new java.awt.Color(255, 255, 255));
        lb_penerima.setAutoscrolls(false);
        lb_penerima.setPhColor(new java.awt.Color(255, 255, 255));
        lb_penerima.setPlaceholder("Nama");
        jPanel5.add(lb_penerima, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Masukkan Nominal");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        lb_nominal.setBackground(new java.awt.Color(98, 82, 246));
        lb_nominal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lb_nominal.setForeground(new java.awt.Color(255, 255, 255));
        lb_nominal.setAutoscrolls(false);
        lb_nominal.setPhColor(new java.awt.Color(255, 255, 255));
        lb_nominal.setPlaceholder("Rp");
        jPanel5.add(lb_nominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(99, 57, 228));
        rSMaterialButtonRectangle2.setText("Bayar");
        rSMaterialButtonRectangle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle2MouseClicked(evt);
            }
        });
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        jPanel5.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 280, 90));

        jLabel7.setBackground(new java.awt.Color(98, 82, 246));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Next");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, 70, 50));

        lb_nama.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(255, 255, 255));
        lb_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nama.setText("Nama");
        jPanel5.add(lb_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 140, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 930, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1528, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new nasabah1(bantuan.getUserName()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void rSMaterialButtonRectangle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2MouseClicked
    int nominal = Integer.parseInt(lb_nominal.getText());
    try{
        model.perubahanDana(bantuan.getUserName(), -nominal);
    }catch (IOException ex){
        Logger.getLogger(topUp.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_rSMaterialButtonRectangle2MouseClicked

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
    
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

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
            java.util.logging.Logger.getLogger(bayarTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bayarTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bayarTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bayarTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bayarTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lb_nama;
    private app.bolivia.swing.JCTextField lb_nominal;
    private app.bolivia.swing.JCTextField lb_penerima;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    // End of variables declaration//GEN-END:variables
}
