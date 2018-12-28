package view;

import model.User;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class UserTableModel extends AbstractTableModel {

    private List<User> users;
    private String[] colNames = {"Id","Login", "Email", "Password"};

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(List<User> users) {
        this.users=users;
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        User user=users.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1 :
                return user.getEmail();
            case 2:
                return user.getLogin();
            case 3:
                return user.getPassword();
        }


        return null;
    }
}
