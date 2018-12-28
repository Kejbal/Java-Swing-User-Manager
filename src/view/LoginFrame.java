package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrame extends JFrame {


    public LoginFrame() {

        super("User Manager");

        Container contentPane = getContentPane();

        SpringLayout layout = new SpringLayout();

        contentPane.setLayout(layout);

        JLabel loginLabel = new JLabel("Login :");
        contentPane.add(loginLabel );
        JTextField loginField = new JTextField(10);
        loginLabel.setLabelFor(loginField);
        contentPane.add(loginField);

        JLabel passwordLabel = new JLabel("Password :");
        contentPane.add(passwordLabel );
        JPasswordField passwordField = new JPasswordField(10);
        loginLabel.setLabelFor(passwordField);
        contentPane.add(passwordField);

        JButton cancelButton = new JButton("Cancel");
        contentPane.add(cancelButton);
        JButton loginButton = new JButton("Login");
        contentPane.add(loginButton);


        //Lay out the panel.
        SpringUtilities.makeCompactGrid(contentPane,
                3, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String login = loginField.getText();
                String password = new String(passwordField.getPassword());

                if (login.equals("admin")  &&  password.equals("toor")) {
                    new UserFrame();
                    LoginFrame.this.dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this,"Wrong login parametr" , "Login error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LoginFrame.this.dispose();

            }
        });

        pack();
        setLocationRelativeTo(null);

        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
