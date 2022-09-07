//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseHelper {
    public CloseHelper() {
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public static void close(PreparedStatement pst) {
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }
}