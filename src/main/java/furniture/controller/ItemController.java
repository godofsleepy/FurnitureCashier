package furniture.controller;

import furniture.connection.MysqlCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Item;

/**
 *
 * @author khada
 */
public class ItemController {
    
    public List<Item> getData(){
         List<Item> list = new ArrayList<>();
        String sql = "SELECT * FROM item";
        try{
              PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    Item item = new Item(
                         rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getInt(4)
                    );
                    list.add(item);
                }
                statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public boolean insert(Item item) {
         String sql = "INSERT INTO item VALUES (NULL, ?, ?, ?)";
        try {
            PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);          
            statement.setString(1, item.getName());
            statement.setString(2, Integer.toString(item.getStock()));
            statement.setInt(3, item.getPrice());
                        
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            System.out.println("Error Insert");
        }
        return false;
    }
}
