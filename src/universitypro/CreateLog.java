/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitypro;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static universitypro.connection.con;

/**
 *
 * @author WAHEEB AL-AQLANY
 */
public class CreateLog extends javax.swing.JFrame {

    /**
     * Creates new form CreateLog
     */
    public CreateLog() {
        initComponents();
        setLocationRelativeTo(null);
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root" , "");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void insertSignupDetails() {

        String Fname = name1.getText();
        String email = email1.getText();
        
        String pwd = password.getText();
        Integer contcat = Integer.parseInt(fone.getText());

        try {
            
            String sql = "insert into student(name,email,pass ,mobile) values(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, Fname );
            pst.setString(2, email);
            pst.setString(3, pwd);
            pst.setInt(4, contcat);
            
            int updateRowCount = pst.executeUpdate();

            if (updateRowCount > 0) {
                JOptionPane.showMessageDialog(null, "تم الإضافة بنجاح");
                
                if (who.getSelectedItem() == "Manager") {
                    ManagerFrame m = new ManagerFrame();
                    m.setVisible(true);
                }
                else if (who.getSelectedItem() == "Student") {
                    addStudentM m = new addStudentM();
                    m.setVisible(true);
                }
                else if (who.getSelectedItem() == "Doctor") {
                    editDoctorF m = new editDoctorF();
                    m.setVisible(true);
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Recoded faillur ");
            }
        } catch (SQLException | HeadlessException e) {

            e.printStackTrace();
        }
    }

    public boolean validatasignup() {
        String name = name1.getText();
        String pwd = password.getText();
        String email = email1.getText();
        String contcat = fone.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Your Name");
            return false;
        }
        if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Your Password");
            return false;
        }
        if (email.equals("") || !email.matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Please Enter Your valid Email");
            return false;
        }
        if (contcat.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Your Contcat N umber");
            return false;
        }

        return true;
    }
    
     public boolean checkuser() {
        String name = email1.getText();
        boolean isExist = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

            PreparedStatement pst = con.prepareStatement("select * from studentu where email = ? ");
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                isExist = true;
            } else {
                isExist = false;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return isExist;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        send = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        send1 = new com.k33ptoo.components.KButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fone = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        who = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/undraw_building_websites_i78t.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 910, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 28)); // NOI18N
        jLabel2.setText("Create Account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 219, -1));

        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1260, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 14, 1260, 37));

        kGradientPanel3.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Password :");
        kGradientPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 30));

        show.setBackground(null);
        show.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                showStateChanged(evt);
            }
        });
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        kGradientPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 250, 20, 40));

        password.setBackground(new java.awt.Color(102, 102, 255));
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        password.setCaretColor(new java.awt.Color(255, 0, 51));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        kGradientPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 310, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        kGradientPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 47));

        name1.setBackground(new java.awt.Color(102, 102, 255));
        name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel3.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 310, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        kGradientPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 47));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        kGradientPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        send.setBackground(new java.awt.Color(51, 0, 51));
        send.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        send.setForeground(new java.awt.Color(0, 204, 204));
        send.setText("Have An account");
        send.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        send.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        send.setkEndColor(new java.awt.Color(102, 102, 102));
        send.setkHoverEndColor(new java.awt.Color(189, 176, 213));
        send.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        send.setkHoverStartColor(new java.awt.Color(69, 63, 80));
        send.setkIndicatorColor(new java.awt.Color(153, 255, 255));
        send.setkIndicatorThickness(10);
        send.setkSelectedColor(new java.awt.Color(51, 51, 51));
        send.setkStartColor(new java.awt.Color(102, 102, 102));
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        kGradientPanel3.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 420, -1));
        kGradientPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 47));

        email1.setBackground(new java.awt.Color(102, 102, 255));
        email1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel3.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 310, 30));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        kGradientPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        send1.setBackground(new java.awt.Color(51, 0, 51));
        send1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        send1.setForeground(new java.awt.Color(0, 204, 204));
        send1.setText("LOG IN");
        send1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        send1.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        send1.setkEndColor(new java.awt.Color(51, 51, 0));
        send1.setkHoverEndColor(new java.awt.Color(189, 176, 213));
        send1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        send1.setkHoverStartColor(new java.awt.Color(69, 63, 80));
        send1.setkIndicatorColor(new java.awt.Color(153, 255, 255));
        send1.setkIndicatorThickness(10);
        send1.setkSelectedColor(new java.awt.Color(51, 51, 51));
        send1.setkStartColor(new java.awt.Color(0, 0, 51));
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });
        kGradientPanel3.add(send1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 280, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        kGradientPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 47));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Phone");
        kGradientPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 30));

        fone.setBackground(new java.awt.Color(102, 102, 255));
        fone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        fone.setCaretColor(new java.awt.Color(255, 0, 51));
        fone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                foneMousePressed(evt);
            }
        });
        fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foneActionPerformed(evt);
            }
        });
        kGradientPanel3.add(fone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 310, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Collaborator_Male_26px.png"))); // NOI18N
        kGradientPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 47));

        who.setBackground(new java.awt.Color(51, 51, 51));
        who.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Student", "Doctor" }));
        who.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                whoInputMethodTextChanged(evt);
            }
        });
        who.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoActionPerformed(evt);
            }
        });
        kGradientPanel3.add(who, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 140, 40));

        jLabel15.setBackground(new java.awt.Color(0, 0, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Google_Mobile_50px.png"))); // NOI18N
        kGradientPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 47));

        jPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1490, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_showStateChanged
        // TODO add your handling code here:
        if (show.isSelected()==true) {
            password.setEchoChar((char)0); // this method convert password to char without any action becaue we put zero
        }
        else{
            password.setEchoChar('*'); // convert into star
        }
    }//GEN-LAST:event_showStateChanged

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (show.isSelected()==true) {
           password.setEchoChar((char)0); // this method convert password to char without any action becaue we put zero
        }
        else{
            password.setEchoChar('*'); // convert into star
        }
    }//GEN-LAST:event_showActionPerformed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed

    }//GEN-LAST:event_passwordMousePressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        if (password.hasFocus()) {
            show.setVisible(true);
        }

    }//GEN-LAST:event_passwordActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        log_in l= new log_in();
        l.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_sendActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
        if (validatasignup() == true) {

            if (checkuser() == false) {
                insertSignupDetails();
              

            } else {
                JOptionPane.showMessageDialog(null, "user name alreade exist");
            }

        }
    }//GEN-LAST:event_send1ActionPerformed

    private void foneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foneMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_foneMousePressed

    private void foneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foneActionPerformed

    private void whoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_whoInputMethodTextChanged

    }//GEN-LAST:event_whoInputMethodTextChanged

    private void whoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoActionPerformed
        String per = who.getItemAt(2);

        who.setBackground(new java.awt.Color(55, 200, 200));
    }//GEN-LAST:event_whoActionPerformed

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
            java.util.logging.Logger.getLogger(CreateLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email1;
    private javax.swing.JPasswordField fone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField name1;
    private javax.swing.JPasswordField password;
    private com.k33ptoo.components.KButton send;
    private com.k33ptoo.components.KButton send1;
    private javax.swing.JCheckBox show;
    private javax.swing.JComboBox<String> who;
    // End of variables declaration//GEN-END:variables
}
