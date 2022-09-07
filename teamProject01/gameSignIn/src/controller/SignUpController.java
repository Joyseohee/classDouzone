package controller;

import db.CloseHelper;
import db.dbConnectSingletonHelper;
import model.SignInVO;

import java.io.PrintStream;
import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

public class SignUpController {
    static Scanner sc;
    static Statement st;
    static ResultSet rs;
    static Connection conn;
    static PreparedStatement pst;
    static boolean doubleCh = true;
    static String idcheck;
    static String pwdcheck;
    static boolean logIn = false;


    public SignUpController() {
    }

    public static void connect() {
        try {
            conn = dbConnectSingletonHelper.getConnection("oracle");
            st = conn.createStatement();
            conn.setAutoCommit(false);
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }

    public static void close() {
        try {
            if (rs != null) {
                CloseHelper.close(rs);
                CloseHelper.close(st);
                CloseHelper.close(pst);
                CloseHelper.close(conn);
            }
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public static void menu() throws SQLException {

        SignInVO vo = new SignInVO();

        while(true) {
            while(true) {
                System.out.println();
                dbConnectSingletonHelper.menu();
                switch (sc.nextInt()) {
                    case 1:
                        Objects.requireNonNull(vo);
                        insert("guser");
                        break;
                    case 2:
                        Objects.requireNonNull(vo);
                        update("guser");
                        break;
                    case 3:
                        delete("guser");
                        break;
                    case 4:
                        signIn("guser");
                        break;
                    case 9:
                        close();
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("없는 번호를 선택하셨습니다. 1부터 4번까지 번호와 9번만 입력해주십시오.");
                }
            }
        }

    }

    // 회원가입
    public static void insert(String className) {
        System.out.println(" ******** 회원가입을 진행합니다. ********");

        try {
            String sql = "INSERT INTO " + className + " VALUES( ?, ?, ?, ? )";
            PreparedStatement pst = conn.prepareStatement(sql);
            System.out.println("이름을 입력해주세요.");
            pst.setString(1, sc.next());
            System.out.println("회원가입하실 ID를 입력해주세요.");
            System.out.println("*** 아이디 중복을 확인합니다.");
            selectID(className);
            if(!doubleCh) {
                pst.setString(2, idcheck);
            } else {
                System.out.println("입력하신 아이디 '" + idcheck + "'가 이미 존재합니다. ");
                System.out.println("가입하실 아이디를 다시 입력해주세요.");
                selectID(className);
                if(!doubleCh) {
                    System.out.println("입력하신 아이디 '" + idcheck + "'가 이미 존재합니다. ");
                    System.out.println("시스템을 종료합니다.");
                    return;
                }
            }
            System.out.println("비밀번호를 입력해주세요.");
            String pwd = sc.next();
            System.out.println("입력하신 비밀번호를 다시 한 번 입력해주세요.");
            String pwdCheck = sc.next();
            if (pwd.equals(pwdCheck)) {
                pst.setString(3, pwd);
            }
            System.out.println("생년월일을 입력해주세요.");
            System.out.println("yyyymmdd형식으로 입력해주세요.");
            System.out.println("2022년 1월 1일에 태어났을 경우 ***");
            System.out.println("'20220101'을 입력합니다.");
            pst.setString(4, sc.next());
            pst.executeUpdate();
            System.out.println("회원가입을 완료하시겠습니까? (y/n) ");
            if (sc.next().equalsIgnoreCase("Y")) {
                conn.commit();
                System.out.println("회원가입이 완료됐습니다.");
            } else {
                conn.rollback();
                System.out.println("회원가입이 취소됐습니다.");
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    // 로그인(signIn)

    public static void signIn(String className) throws SQLException {
        System.out.println("\t>> 로그인 페이지 <<");
        selectID(className);
        if (!doubleCh) {
            selectPWD(className);
            if (doubleCh) {
                System.out.println("로그인에 성공하셨습니다.");
                logIn = true;
            }
            else {
                System.out.println("로그인에 실패하셨습니다.\n시스템을 종료합니다.");
                System.exit(0);
            }
        }
    }

    // 로그아웃
    public static void signOut() {

    }

    // 아이디 확인(select where id)
    public static void selectID(String className) throws SQLException {
        System.out.println("아이디를 입력하세요.");
        idcheck = sc.next();

        pst = conn.prepareStatement("select * from " + className + " where U_ID = ? ");
        pst.setString(1, idcheck);
        rs = pst.executeQuery();

        while(rs.next()) {
            String U_ID = rs.getString(2);
            if(U_ID.equals(idcheck)) {
                System.out.println("입력하신 아이디가 존재합니다.");
                doubleCh = false;
                break;
            }
        }
    }

    // 비밀번호 확인(select where pwd)
    public static String selectPWD(String className) throws SQLException {
        System.out.println("비밀번호를 입력하세요.");
        pwdcheck = sc.next();
        doubleCh = true;

        pst = conn.prepareStatement("select * from " + className + " where U_PWD = ? ");
        pst.setString(1, pwdcheck);
        rs = pst.executeQuery();

        while(rs.next()) {
            String U_PWD = rs.getString(2);
            if(U_PWD.equals(pwdcheck)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            } else {
                doubleCh = false;
            }
        }
        return pwdcheck;
    }


    // 회원정보 수정(update)
    public static void update(String className) throws SQLException {

        String U_ID;
        String U_PWD;
        String modify;
        signIn(className);
        U_ID = idcheck;
        U_PWD = pwdcheck;

            a:
            while(true) {
                System.out.println("변경하실 정보를 선택해주세요.");
                System.out.println("**** 아이디는 변경하실 수 없습니다. ****");
                System.out.println("\n\n1.이름 \t2.비밀번호 \t3.생일");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("수정할 이름 : ");
                        st.execute("update " + className + " set U_NAME = " + sc.next() + " where U_ID = " + U_ID);
                        continue a;
                    case 2:
                        System.out.println("수정할 비밀번호 : ");
                        String pwd = sc.next();
                        System.out.println("입력하신 비밀번호를 다시 한 번 입력해주세요.");
                        String pwdCheck = sc.next();
                        if (pwd.equals(pwdCheck)) {
                            pst.setString(3, pwd);
                            st.execute("update " + className + " set U_PWD = " + sc.next() + " where U_ID = " + U_ID);
                            continue a;
                        } else {
                            System.out.println("비밀번호가 일치하지 않습니다.");
                            System.out.println("설정 화면으로 돌아갑니다.");
                            continue a;
                        }
                    case 3:
                        System.out.println("수정할 생년월일 : ");
                        st.execute("update " + className + " set BIRTH = " + sc.next() + " where U_ID = " + U_ID);
                        continue a;

                }

                switch (choice) {
                    case 1:
                        modify = "이름";
                        break;
                    case 2:
                        modify = "비밀번호";
                        break;
                    case 3:
                        modify = "생년월일";
                        break;
                    default:
                        System.out.println("회원정보 수정을 취소했습니다.");
                }
            }
        }



    // 회원탈퇴(delete)
    public static void delete(String className) throws SQLException {
        signIn(className);
        if(logIn == true) {
            System.out.print("탈퇴하시겠습니까? (y/n)");
            String ans = sc.next();

            if(ans.equalsIgnoreCase("y")) {
                try {
                    pst = conn.prepareStatement("DELETE " + className + " WHERE U_ID = ?");
                    pst.setString(1, idcheck);
                    int result = pst.executeUpdate();
                    System.out.println("정말 삭제하시겠습니까? (y/n) ");
                    if (sc.next().equalsIgnoreCase("Y")) {
                        conn.commit();
                        System.out.println("탈퇴가 완료됐습니다.");
                    } else {
                        conn.rollback();
                        System.out.println("탈퇴가 취소됐습니다.");
                    }
                } catch (Exception var3) {
                    var3.printStackTrace();
                }
            } else if(ans.equalsIgnoreCase("n")) return;
            else {
                System.out.println("잘못 입력하셨습니다.");
                delete(className);
            }


        }




    }

}
