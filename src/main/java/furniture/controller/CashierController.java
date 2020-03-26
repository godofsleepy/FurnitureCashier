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
        String sql = "INSERT INTO `transaction` (`id_transaction`, `total`, `id_user`, `shipment`, `discount`, `datetime`) VALUES ( NULL, "+ transaction.getTotal() +", "+ transaction.getId_user() +", '0', NULL, current_timestamp())";
        String query_id = "SELECT LAST_INSERT_ID()";
        try {
            Statement state = MysqlCon.state;
            
            state.executeUpdate(sql);
            ResultSet rs = state.executeQuery(query_id);
            if(rs.next()){
                int id = rs.getInt(1);
                for(int i =0; i < transaction.getId().size(); i++){
                    System.out.println("" + id + " " + transaction.getId().get(0));
                    String query = "INSERT INTO `transaction_item` (`id_transaction`, `id_item`) VALUES ('"+id+"', '"+transaction.getId().get(i)+"');";
                    state.executeUpdate(query);
                }
                 return true;
            }
            state.close();      
        } catch (Exception ex) {
            System.out.println("Error Insert");
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
