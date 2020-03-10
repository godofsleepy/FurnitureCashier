package furniture.controller;

import furniture.connection.MysqlCon;
import furniture.form.AdminForm;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author khada
 */
public class UserController {
    
    public boolean update(User user, String id){
        String sql = "UPDATE user SET name = ?, gender = ?, job = ?, username = ?, password = ? WHERE user.id_user = ?";
        try {
            PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);          
            statement.setString(1, user.getName());
            statement.setString(2, user.getGender());
            statement.setString(3, user.getJob());
            statement.setString(4, user.getUsername());
            statement.setString(5, user.getPassword());
            statement.setString(6, id);
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public boolean insert(User user){
           String sql = "INSERT INTO user VALUES (NULL, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);          
            statement.setString(1, user.getName());
            statement.setString(2, user.getGender());
            statement.setString(3, user.getJob());
            statement.setString(4, user.getUsername());
            statement.setString(5, user.getPassword());
            
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
    
    public List<User> getData(){
           List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try{
              PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    User user = new User(
                         rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    list.add(user);
                }
                statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
   public List<User> getDataByName(String name){
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE name LIKE '%"+name+"%'";
        try{
              PreparedStatement statement = MysqlCon.getConnection().prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    User user = new User(
                         rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    list.add(user);
                }
                statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
