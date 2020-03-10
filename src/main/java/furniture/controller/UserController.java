package furniture.controller;

import furniture.dao.UserDao;
import furniture.dao.UserDaoMysql;
import furniture.form.AdminForm;
import java.util.List;
import model.User;

/**
 *
 * @author khada
 */
public class UserController {
    private UserDao data = new UserDaoMysql();
   
    public List<User> getData(){
        return data.getAllUser();
    }
    
   public List<User> getDataByName(String name){
        return data.getUserByName(name);
    }
}
