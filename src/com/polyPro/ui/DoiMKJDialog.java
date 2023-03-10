package com.polyPro.ui;

import com.polyPro.dao.NhanVienDAO;
import com.polyPro.utils.XDialog;
import com.polyPro.utils.XJdbc;
import com.polyPro.utils.XShare;
import java.awt.event.WindowEvent;

/**
 *
 * @author duong, cuong, vinh
 */
public class DoiMKJDialog extends javax.swing.JDialog {

    NhanVienDAO dao = new NhanVienDAO();
    
    public DoiMKJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        txtNewPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtRePass = new javax.swing.JPasswordField();
        btnChange = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblShowPass = new javax.swing.JLabel();
        lblHidenPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyPro/icon/11669630_20943844.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        jPanel3.setBackground(new java.awt.Color(223, 238, 234));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Change Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, -1));

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(223, 238, 234));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(61, 60, 66));
        txtUsername.setBorder(null);
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 147, 314, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 60, 66));
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 116, 109, -1));

        jSeparator1.setForeground(new java.awt.Color(61, 60, 66));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 173, 320, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(61, 60, 66));
        jLabel4.setText("Password");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 189, 84, -1));

        jSeparator2.setForeground(new java.awt.Color(61, 60, 66));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 244, 320, 10));

        txtPass.setBackground(new java.awt.Color(223, 238, 234));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(61, 60, 66));
        txtPass.setActionCommand("<Not Set>");
        txtPass.setBorder(null);
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 220, 314, -1));

        txtNewPass.setBackground(new java.awt.Color(223, 238, 234));
        txtNewPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNewPass.setForeground(new java.awt.Color(61, 60, 66));
        txtNewPass.setActionCommand("<Not Set>");
        txtNewPass.setBorder(null);
        jPanel3.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 303, 280, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(61, 60, 66));
        jLabel5.setText("New password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 272, 146, -1));

        jSeparator3.setForeground(new java.awt.Color(61, 60, 66));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 327, 320, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(61, 60, 66));
        jLabel6.setText("Re-enter the password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 355, 208, -1));

        jSeparator4.setForeground(new java.awt.Color(61, 60, 66));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 410, 320, 10));

        txtRePass.setBackground(new java.awt.Color(223, 238, 234));
        txtRePass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePass.setForeground(new java.awt.Color(61, 60, 66));
        txtRePass.setActionCommand("<Not Set>");
        txtRePass.setBorder(null);
        jPanel3.add(txtRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 386, 314, -1));

        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChange.setText("CHANGE");
        btnChange.setBorder(null);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel3.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 438, 153, 38));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyPro/icon/close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel3.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 0, 37, 32));

        jPanel4.setBackground(new java.awt.Color(223, 238, 234));
        jPanel4.setLayout(new java.awt.CardLayout());

        lblShowPass.setBackground(new java.awt.Color(223, 238, 234));
        lblShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyPro/icon/view.png"))); // NOI18N
        lblShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPassMousePressed(evt);
            }
        });
        jPanel4.add(lblShowPass, "card3");

        lblHidenPass.setBackground(new java.awt.Color(127, 82, 131));
        lblHidenPass.setForeground(new java.awt.Color(127, 82, 131));
        lblHidenPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyPro/icon/hidden.png"))); // NOI18N
        lblHidenPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPassMousePressed(evt);
            }
        });
        jPanel4.add(lblHidenPass, "card2");

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 30, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPassMousePressed
        statusPass(true);
    }//GEN-LAST:event_lblShowPassMousePressed

    private void lblHidenPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPassMousePressed
        statusPass(false);
    }//GEN-LAST:event_lblHidenPassMousePressed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        change();
    }//GEN-LAST:event_btnChangeActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoiMKJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMKJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMKJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMKJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DoiMKJDialog dialog = new DoiMKJDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHidenPass;
    private javax.swing.JLabel lblShowPass;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRePass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setIconImage(XShare.APP_ICON);
        setLocationRelativeTo(null);
        txtUsername.setText(XShare.USER.getMaNV());
    }
    
    private void statusPass(boolean st) {
        lblShowPass.setVisible(!st);
        lblHidenPass.setVisible(st);
        if(st) txtNewPass.setEchoChar((char) 0);
        else txtNewPass.setEchoChar('*');
    }
    
    private boolean isValidate() {
        if(txtNewPass.getText().equals("")) {
            XDialog.alert(this, "Your new password can't be empty");
            txtNewPass.requestFocus();
            return false;
        }
        if(!txtNewPass.getText().equals(txtRePass.getText())) {
            XDialog.alert(this, "Your re-enter pass wasn't correct");
            txtRePass.requestFocus();
            return false;
        }
        return true;
    }
    
    private void change() {
        if(!isValidate()) return;
        
        if(txtPass.getText().equals(XShare.USER.getMatKhau())) {
            try {
                String sql = "UPDATE NhanVien SET MatKhau=? WHERE MaNV=?";
                XJdbc.executeUpdate(sql,
                        txtNewPass.getText(),
                        txtUsername.getText());
                XDialog.alert(this, "Update password successful!");
            } catch (Exception e) {
                XDialog.alert(this, "Update password fail!");
            }
        }else {
            XDialog.alert(this, "Your password wasn't correct");
        }
    }
}
