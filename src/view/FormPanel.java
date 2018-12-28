package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private FormListener formListener;

    public FormPanel() {

        Dimension dim=new Dimension();

        dim.width=300;

        setPreferredSize(dim);


        JLabel loginLabel = new JLabel("Login : ");
        JTextField loginField = new JTextField(10);

        JLabel emailLabel = new JLabel("Email : ");
        JTextField emailField = new JTextField(10);

        JLabel passwordLabel = new JLabel("Password : ");
        JPasswordField passwordField = new JPasswordField(10);

        JButton addButton = new JButton("Add");


        Border innerBorder = BorderFactory.createTitledBorder("Add User");
        Border outerBorder = BorderFactory.createEmptyBorder(5,1,5,1);

        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.NORTHEAST;

        gc.weightx=0;
        gc.weighty=0;
        gc.insets = new Insets(10,10,0,10);


        gc.gridx =0;
        gc.gridy =0;

        add(loginLabel, gc);


        gc.gridx =1;
        gc.gridy =0;


        add(loginField, gc);

        gc.gridx =0;
        gc.gridy =1;


        add(emailLabel, gc);

        gc.gridx =1;
        gc.gridy =1;

        add(emailField, gc);

        gc.gridx =0;
        gc.gridy =2;

        add(passwordLabel, gc);

        gc.gridx =1;
        gc.gridy =2;

        add(passwordField, gc);

        gc.gridx =1;
        gc.gridy =3;

        add(addButton, gc);

        gc.gridx =0;
        gc.gridy =4;
        gc.weightx=1;
        gc.weighty=1;

        add(new JLabel(" "), gc);

        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String login=loginField.getText();
                String email=emailField.getText();
                String password=new String(passwordField.getPassword());

                FormEvent ev = new FormEvent(this, login, email, password);

                if (formListener!=null) {
                    formListener.formEventOccurred(ev);
                }


            }

        });

    }

    public void setFormListener(FormListener listener) {
        this.formListener=listener;
    }

}
