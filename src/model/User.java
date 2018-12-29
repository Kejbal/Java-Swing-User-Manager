package model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5284219126584857598L;
    private static int count=0;

    private int id;
    private String login;
    private String email;
    private String password;

    public User(int size) {
        this.count=size;
    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;

        this.id=count;
        count++;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
