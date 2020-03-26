
package model;

public class User {
    int id;
    String name;
    String gender;
    String job;
    String username;
    String password;

    public User(int id, String name, String gender, String job, String username, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.username = username;
        this.password = password;
    }
    
      public User( String name, String gender, String job, String username, String password) {
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
