package view;

import controllers.UserController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class UserFrame extends JFrame {



    public UserFrame() {

        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        menuBar.setPreferredSize(new Dimension(100, 25));

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem logoutItem = new JMenuItem("Logout");
        logoutItem.setMnemonic(KeyEvent.VK_L);
        fileMenu.add(logoutItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        fileMenu.add(exitItem);

        setJMenuBar(menuBar);

        logoutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int confirm= JOptionPane.showConfirmDialog(
                        UserFrame.this,
                        "Are you sure you want logout?",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm==0) {

                    new LoginFrame();
                    UserFrame.this.dispose();

                }

            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int confirm= JOptionPane.showConfirmDialog(
                        UserFrame.this,
                        "Are you sure you want exit?",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION,  JOptionPane.WARNING_MESSAGE);


                if (confirm==0) {

                    UserFrame.this.dispose();

                }

            }
        });

        FormPanel formPanel=new FormPanel();
        TablePanel tablePanel=new TablePanel();

        UserController userController=new UserController();

        tablePanel.setData(userController.getUsers());

        formPanel.setFormListener(new FormListener() {
            public void formEventOccurred(FormEvent e) {

                userController.addUser(e);
                tablePanel.refresh();

            }
        });

        add(formPanel, BorderLayout.WEST);
        add(tablePanel, BorderLayout.CENTER);


        pack();
        setLocationRelativeTo(null);

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


}
