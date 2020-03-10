package furniture.dao;

import java.util.List;
import model.User;

public interface UserDao {
    
    public boolean insert(User user);
    
    public boolean update(User user);
    
    public boolean delete(User user);
    
    public List<User> getAllUser();
       
    public List<User> getUserByName(String name);
}
