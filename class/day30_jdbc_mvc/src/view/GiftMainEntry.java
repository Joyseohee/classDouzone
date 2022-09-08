package view;

import controller.GiftController;

import java.sql.SQLException;

public class GiftMainEntry {
    public static void main(String[] args) throws SQLException {
        GiftController.connect();
        GiftController.memu();
    }
}
