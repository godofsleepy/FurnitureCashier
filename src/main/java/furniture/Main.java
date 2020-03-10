/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furniture;

import furniture.connection.MysqlCon;
import furniture.form.LoginForm;
import java.sql.Connection;

/**
 *
 * @author khada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = MysqlCon.getConnection();
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
    }
    
}
