package controllers;

import model.User;
import model.Users;
import view.FormEvent;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class UserController {

    Users users=new Users();

    public List<User> getUsers() {

        return users.getUsers();

    }

    public void addUser(FormEvent ev) {

        String login = ev.getLogin();
        String email = ev. getEmail();
        String password = ev.getPassword();

        User user=new User(login, email, password);

        users.addUser(user);

    }

    public void saveToFile(File file) throws IOException {
        users.saveToFile(file);
    }

    public void loadToFile(File file) throws IOException {
        users.loadToFile(file);
    }
}
