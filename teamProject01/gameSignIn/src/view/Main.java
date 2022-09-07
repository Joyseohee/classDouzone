package view;


import controller.SignUpController;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        SignUpController.connect();
        SignUpController.menu();
    }
}
