package furniture.form;

import furniture.connection.MysqlCon;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
    Connection con;
    Statement state;
    ResultSet result;
    String sql;

 
    public LoginForm() {
        initComponents();
        con = MysqlCon.getConnection();
        state = MysqlCon.state;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_signin = new javax.swing.JButton();
        txt_password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel1.setText("Login");

        btn_signin.setText("Sign In");
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_signin))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_signin)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        try {
            sql = "SELECT * FROM user WHERE username='"+txt_username.getText()+"' AND password='"+txt_password.getText()+"'";
            result = state.executeQuery(sql);
            if(result.next()){
                if(txt_username.getText().equals(result.getString("username")) && txt_password.getText().equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    this.setVisible(false);
                    if(result.getString(4).equals("Admin")){
                      AdminForm admin = new AdminForm();
                    admin.setVisible(true);   
                    }else{
                      CashierForm cashier = new CashierForm();
                      cashier.setVisible(true);
                    }
                   
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_signinActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
