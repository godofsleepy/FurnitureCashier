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

        jPanel1 = new javax.swing.JPanel();
        Furniture = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_signin = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Furniture1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Future Furniture - Login");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 720));

        Furniture.setBackground(new java.awt.Color(189, 174, 160));
        Furniture.setFont(new java.awt.Font("Asap Medium", 1, 36)); // NOI18N
        Furniture.setForeground(new java.awt.Color(95, 54, 32));
        Furniture.setText("Future");

        txt_username.setFont(new java.awt.Font("Asap", 0, 18)); // NOI18N

        btn_signin.setBackground(new java.awt.Color(75, 44, 25));
        btn_signin.setFont(new java.awt.Font("Asap Medium", 2, 18)); // NOI18N
        btn_signin.setForeground(new java.awt.Color(255, 255, 255));
        btn_signin.setText("Log In");
        btn_signin.setBorder(null);
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ink Free", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(8, 0, 20));
        jLabel3.setText("Just Chill");

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon awesome-user-lock.png")); // NOI18N

        Furniture1.setBackground(new java.awt.Color(189, 174, 160));
        Furniture1.setFont(new java.awt.Font("Asap Medium", 1, 36)); // NOI18N
        Furniture1.setForeground(new java.awt.Color(95, 54, 32));
        Furniture1.setText("Furniture");

        jLabel4.setFont(new java.awt.Font("Gotham XLight", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 0, 20));
        jLabel4.setText("to your account.");

        jLabel5.setFont(new java.awt.Font("Gotham XLight", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(8, 0, 20));
        jLabel5.setText("Welcome Back, Please login");

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon material-person.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(8, 0, 20));
        jLabel7.setText("Note : Always Happy :)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7))))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Furniture1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Furniture, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Furniture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Furniture1)
                .addGap(109, 109, 109)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(78, 78, 78))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Chair.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
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
                      CashierForm cashier = new CashierForm(result.getString(1));
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
    private javax.swing.JLabel Furniture;
    private javax.swing.JLabel Furniture1;
    private javax.swing.JButton btn_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
