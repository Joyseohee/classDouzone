package controller;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.DeptVO;

import java.sql.*;
import java.util.Scanner;

public class DeptController { // controller

    // conn, insert, delete, insert, select
    static Scanner sc = new Scanner(System.in);
    static Statement stmt = null;
    static ResultSet rs = null;
    static Connection conn = null;
    static PreparedStatement pst = null;

    // connect
    public static void connect() {
        try {
            conn = ConnectionHelper.getConnection("oracle");
            stmt = conn.createStatement();
            conn.setAutoCommit(false); // 자동 commit 해제

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // close
    public static void close() {
        try {
            if (rs != null) {
                CloseHelper.close(rs);
                CloseHelper.close(stmt);
                CloseHelper.close(pst);
                CloseHelper.close(conn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // menu
    public static void memu() throws SQLException {
        DeptVO vo = new DeptVO();
        while (true) {
            System.out.println();

            ConnectionHelper.menu();

            switch (sc.nextInt()) {
                case 0:
                    System.out.println("Commit하시겠습니까? (Y/N)");
                    System.out.println("안 하시려면 Rollback됩니다.");
                    if (sc.next().equalsIgnoreCase("Y")) {
                        conn.commit();    // Occured Exception
                        selectAll(vo.getClassName());
                    } else {
                        conn.rollback();
                        selectAll(vo.getClassName());
                    }
                    break;
                case 1:
                    selectAll(vo.getClassName());
                    insert(vo.ClassName);
                    selectAll(vo.getClassName());
                    break;
                case 2:
                    selectAll(vo.getClassName());
                    update(vo.ClassName);
                    selectAll(vo.getClassName());
                    break;
                case 3:
                    selectAll(vo.getClassName());
                    break;
                case 4:
                    selectByGno(vo.getClassName());
                    break;
                case 5:
                    selectAll(vo.getClassName());
                    delete(vo.ClassName);
                    selectAll(vo.getClassName());
                    break;
                case 6:
                    conn.commit();
                    System.out.println("성공적으로 완료됐습니다.");
                    break;
                case 7:
                    close();
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("없는 번호를 선택하셨습니다. 0부터 7번까지 번호만 입력해주십시오.");
                    break;
            }
        }
    }

    // delete
    public static void delete(String className) throws SQLException {
        System.out.print("delete recode number gno= ");
        String DEPTNO = sc.next();
        try {
            pst = conn.prepareStatement("DELETE " + className + " WHERE DEPTNO = ?");
            pst.setString(1, DEPTNO);
            int result = pst.executeUpdate();  // 쿼리 실행

            System.out.println("정말 삭제하시겠습니까? (y/n) ");
            if (sc.next().equalsIgnoreCase("Y")) {
                conn.commit();  // 예외발생
                System.out.println(result + " 개의 데이터가 삭제 되었습니다. ");
            } else {
                conn.rollback();
                System.out.println("rollback 되었습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // rollback
    public static void rollback() throws SQLException {
        conn.rollback();
        System.out.println("rollback success");
    }

    // commit
    public static void commit() throws SQLException {
        conn.commit();
        System.out.println("commit success!!");
    }

    // update
    public static void update(String className) throws SQLException {

        a:
        while (true) {
            String modify = null;

            System.out.println("0 선택 ==> update 탈출합니다.");
            System.out.println("\n\n수정할 DEPTNO : ");
            int DEPTNO = sc.nextInt();

            b:
            while (true) {
                System.out.println("\n\n1.DEPTNO\t2.DNAME\t3.LOC\t0.EXIT");
                System.out.println("수정할 필드 : ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("바뀔 DEPTNO : ");
                        stmt.execute("update " + className + " set DEPTNO = " + sc.nextInt() + "where DEPTNO = " + DEPTNO);
                        break b;
                    case 2:
                        System.out.println("바뀔 DNAME : ");
                        stmt.execute("update " + className + " set DNAME = \'" + sc.next() + "\' where DEPTNO = " + DEPTNO);
                        break b;
                    case 3:
                        System.out.println("바뀔 LOC : ");
                        stmt.execute("update " + className + " set LOC = " + sc.nextInt() + "where DEPTNO = " + DEPTNO);
                        break b;
                    case 0: break a;
                    default:
                        System.out.println("잘못된 번호입니다.");
                        break;
                }

                switch (choice) {
                    case 1:
                        modify = "DEPTNO";
                    case 2:
                        modify = "DNAME";
                    case 3:
                        modify = "LOC";
                }
                System.out.println(modify + "를 수정했습니다.");
            }
        }
    }

    // insert
    public static void insert(String className) {
        System.out.println("insert recode ********");
        try {
            String sql = "INSERT INTO " + className + " VALUES( ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            System.out.println("DEPTNO를 입력해주세요.");
            pst.setInt(1, sc.nextInt());
            System.out.println("DNAME을 입력해주세요.");
            pst.setString(2, sc.next());
            System.out.println("LOC를 입력해주세요.");
            pst.setString(3, sc.next());
            int result = pst.executeUpdate();    // 반드시 해줘야 들어감(int에 담진 않아도 됨)

            System.out.println("commit 하시겠습니까? (y/n) ");
            if (sc.next().equalsIgnoreCase("Y")) {
                conn.commit();  // 예외발생
                System.out.println(result + " 개의 데이터가 commit 되었습니다. ");
            } else {
                conn.rollback();
                System.out.println("rollback 되었습니다.");
            }
            System.out.println(result + " 개 데이터 추가 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // select all
    public static void selectAll(String className) throws SQLException {
        rs = stmt.executeQuery("SELECT * FROM " + className);

        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= count; i++) {  // 타입별로 출력하기

                switch (rsmd.getColumnType(i)) {
                    case Types.NUMERIC:
                    case Types.INTEGER:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
                        break;
                    case Types.FLOAT:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
                        break;
                    case Types.DOUBLE:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
                        break;
                    case Types.CHAR:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
                        break;
                    case Types.DATE:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
                        break;
                    default:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "\t");
                        break;
                } // switch end
            } // end for
            System.out.println();
        } // end while
    }

    // select ~ where
    private static void selectByGno(String className) throws SQLException {  //
        System.out.println("검색할 부서 번호를 입력하세요.");
        pst = conn.prepareStatement("select * from " + className + " where Deptno = ? ");
        pst.setInt(1, sc.nextInt());
        rs = pst.executeQuery();  //

        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= count; i++) {  // 타입별로 출력하기

                switch (rsmd.getColumnType(i)) {
                    case Types.NUMERIC:
                    case Types.INTEGER:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
                        break;
                    case Types.FLOAT:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + "  ");
                        break;
                    case Types.DOUBLE:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + "  ");
                        break;
                    case Types.CHAR:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "  ");
                        break;
                    case Types.DATE:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + "  ");
                        break;
                    default:
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + "\t");
                        break;
                } // switch end
            } // end for
            System.out.println();
        } // end while
    } // end selectByGno

}
