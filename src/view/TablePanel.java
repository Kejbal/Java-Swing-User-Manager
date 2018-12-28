package view;

import model.User;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TablePanel extends JTable {

    private UserTableModel tableModel;


    public TablePanel() {

        tableModel=new UserTableModel();
        JTable table=new JTable(tableModel);

        setLayout(new BorderLayout());

        add(new JScrollPane(table),BorderLayout.CENTER);

    }

    public void setData(List<User> users) {

        tableModel.setData(users);

    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }
}
