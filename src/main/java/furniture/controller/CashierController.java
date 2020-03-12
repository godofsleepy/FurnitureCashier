/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package furniture.controller;

import furniture.connection.MysqlCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Transaction;

/**
 *
 * @author khada
 */
public class CashierController {
    public boolean transactionn(Transaction transaction){
        String sql = "INSERT INTO `transaction` (`id_transaction`, `address`, `number_phone`, `customer`, `total`, `id_user`, `shipment`, `discount`) VALUES (NULL, NULL, NULL, NULL, "+ transaction.getTotal() +", "+ transaction.getId_user() +", '0', NULL); SELECT LAST_INSERT_ID();";
        try {
            PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
            if(rs.next()){
                int id = rs.getInt(0);
                for(int i =0; i < transaction.getId().size(); i++){
                    String query = "INSERT INTO `transaction_item` (`id_transaction`, `id_item`) VALUES ("+id+"', "+transaction.getId().get(i)+");";
                    statement.executeUpdate(query);
                }
            }
            statement.close();
            return true;
        } catch (Exception ex) {
            System.out.println("Error Insert");
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
