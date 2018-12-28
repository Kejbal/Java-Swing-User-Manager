package model;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private ArrayList<User> users;

    public Users() {

        users=new ArrayList<User>();

    }

    public void addUser(User user) {

        users.add(user);

    }

    public List<User> getUsers() {
        return users;
    }
}