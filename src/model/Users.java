package model;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Users {

    private ArrayList<User> users;

    public Users() {

        users= new ArrayList();

    }

    public void addUser(User user) {

        users.add(user);

    }

    public List<User> getUsers() {
        return users;
    }

    public void saveToFile(File file) throws IOException {
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);


        User[] users_array= users.toArray(new User[users.size()]);

        oos.writeObject(users_array);

        oos.close();
    }

    public void loadToFile(File file) throws IOException {
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

       try {

            User[] users_array=(User[])ois.readObject();

            users.clear();

            users.addAll(Arrays.asList(users_array));

        } catch(ClassNotFoundException e) {

            e.printStackTrace();
        }

        ois.close();
    }
}
