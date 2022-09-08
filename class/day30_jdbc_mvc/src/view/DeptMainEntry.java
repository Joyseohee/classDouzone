package view;

import controller.DeptController;
import java.sql.SQLException;

public class DeptMainEntry {
    public static void main(String[] args) throws SQLException  {
        DeptController.connect();
        DeptController.memu();
    }

}
