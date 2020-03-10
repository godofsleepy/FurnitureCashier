package furniture.dao;

import furniture.connection.MysqlCon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author khada
 */
public class UserDaoMysql implements UserDao {

    @Override
    public boolean insert(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllUser() {
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

    @Override
    public List<User> getUserByName(String name) {
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
