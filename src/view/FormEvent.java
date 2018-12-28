package view;

import java.util.EventObject;

public class FormEvent extends EventObject {

    private String login;
    private String email;
    private String password;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String login, String email, String password) {
        super(source);

        this.login = login;
        this.email = email;
        this.password = password;
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
