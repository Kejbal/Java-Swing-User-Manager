package view;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class UserFileFilter extends FileFilter {


    @Override
    public boolean accept(File file) {

        String name=file.getName();

        String extension=Utilis.getFileExtension(name);

        if (file.isDirectory()) {
            return true;
        }

        if (extension==null) {
            return false;
        }

        if (extension.equals("dat")) {
            return true;
        }

        return false;
    }

    @Override
    public String getDescription() {
        return "User data file (*.dat)";
    }
}
