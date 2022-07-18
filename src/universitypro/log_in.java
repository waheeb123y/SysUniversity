
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
public class log_in extends javax.swing.JFrame {

    /**
     * Creates new form log_in
     */
        String name , pass ;
        int id ;
    
    public  log_in() {
        
       
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Log In");
        show.setVisible(false);
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root" , "");

        } catch (ClassNotFoundException | SQLException e) {
            
        }
    }
    
       public void ligin() {
        String name = name1.getText();
        String pwd = password.getText();

        try {
           
            PreparedStatement pst = con.prepareStatement("select * from student where name = ? "
                                                             + "     and pass= ?  ");
            pst.setString(1, name);
            pst.setString(2, pwd);
            
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "login successfuly");
                if (who.getSelectedItem() == "Manager")
                
                {
                    ManagerFrame m = new ManagerFrame();
                    m.setVisible(true);
                }
                else if (who.getSelectedItem() == "Student") {
                    addStu m = new addStu();
                    m.setVisible(true);
                }
                else if (who.getSelectedItem() == "Doctor") {
                    editDoctorF m = new editDoctorF();
                    m.setVisible(true);
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "in correct username or password");
            }
        } catch (SQLException | HeadlessException e) {
            e.printStackTrace();
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        identity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        who = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        send = new com.k33ptoo.components.KButton();
        send1 = new com.k33ptoo.components.KButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        yellow = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51), new java.awt.Color(51, 51, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(60, 63, 65), new java.awt.Color(51, 51, 0))));
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Password :");

        identity.setBackground(new java.awt.Color(204, 204, 204));
        identity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setBackground(new java.awt.Color(0, 0, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Conference_26px.png"))); // NOI18N

        jLabel5.setText("Identity NO.");

        show.setBackground(null);
        show.setText("show");
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

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
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

        jLabel13.setBackground(new java.awt.Color(0, 0, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N

        who.setBackground(new java.awt.Color(51, 51, 51));
        who.setForeground(new java.awt.Color(255, 255, 51));
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

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("AS");

        name1.setBackground(new java.awt.Color(204, 204, 204));
        name1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N

        jLabel6.setText("User Name :");

        send.setBackground(new java.awt.Color(51, 0, 51));
        send.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        send.setForeground(new java.awt.Color(0, 204, 204));
        send.setText("LOG IN");
        send.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        send.setkBackGroundColor(new java.awt.Color(51, 51, 51));
        send.setkEndColor(new java.awt.Color(51, 51, 0));
        send.setkHoverEndColor(new java.awt.Color(189, 176, 213));
        send.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        send.setkHoverStartColor(new java.awt.Color(69, 63, 80));
        send.setkIndicatorColor(new java.awt.Color(153, 255, 255));
        send.setkIndicatorThickness(10);
        send.setkSelectedColor(new java.awt.Color(51, 51, 51));
        send.setkStartColor(new java.awt.Color(0, 0, 51));
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel6))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(128, 128, 128)
                        .addComponent(show))
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(who, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(identity, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(who, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        send1.setBackground(new java.awt.Color(51, 0, 51));
        send1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        send1.setForeground(new java.awt.Color(0, 204, 204));
        send1.setText("Create Account");
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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(send1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -2, 980, 450));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px_1.png"))); // NOI18N
        jMenuItem1.setText("logIn");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jMenuItem2.setText("log out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Library_32px.png"))); // NOI18N
        jMenu3.setText("Change style");

        yellow.setText("Yellow");
        yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowActionPerformed(evt);
            }
        });
        jMenu3.add(yellow);

        jMenuItem5.setText("green");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("dark cyan");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("black");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenu2.add(jMenu3);

        jMenu4.setText("window");
        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(994, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yellowActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        
    }//GEN-LAST:event_showActionPerformed

    private void showStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_showStateChanged
        // TODO add your handling code here:
        if (show.isSelected()==true) {
           password.setEchoChar((char)0); // this method convert password to char without any action becaue we put zero
        }
        else{
            password.setEchoChar('*'); // convert into star
        }

    }//GEN-LAST:event_showStateChanged

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        ligin();
    }//GEN-LAST:event_sendActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        if (password.hasFocus()) {
            show.setVisible(true);
        }
        
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
    
    }//GEN-LAST:event_passwordMousePressed

    private void whoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_whoInputMethodTextChanged
        
    }//GEN-LAST:event_whoInputMethodTextChanged

    private void whoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoActionPerformed
        String per = who.getItemAt(2);
        
           who.setBackground(new java.awt.Color(55, 200, 200));

    }//GEN-LAST:event_whoActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
        CreateLog c= new CreateLog();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_send1ActionPerformed

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
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField identity;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField name1;
    private javax.swing.JPasswordField password;
    private com.k33ptoo.components.KButton send;
    private com.k33ptoo.components.KButton send1;
    private javax.swing.JCheckBox show;
    private javax.swing.JComboBox<String> who;
    private javax.swing.JMenuItem yellow;
    // End of variables declaration//GEN-END:variables
}
