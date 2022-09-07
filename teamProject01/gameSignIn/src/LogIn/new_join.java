package LogIn;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import db.dbConnectSingletonHelper;

public class new_join extends JFrame implements ActionListener {

    JPanel panWest, panSouth; // 왼쪽텍스트필드, 아래쪽 버튼
    JPanel p1, p2, p3, p4;
    JTextField txtname, txtid, txtpwd, txtbirth;
    JButton btncommit, btncancel;

    JTable table; // 검색과 전체 보기를 위한 테이블 객체 생성

    // 상태변화를 위한 변수 선언
    final int NONE = 0;
    final int COMMIT = 1;
    final int CANCEL = 2;
    int cmd = NONE;

    public new_join() {// 멤버변수 초기화 담당 - 생성자함수 // component 등록

        panWest = new JPanel(new GridLayout(5, 0));
        p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p1.add(new JLabel("이름"));
        p1.add(txtname = new JTextField(12));
        panWest.add(p1);

        p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(new JLabel("아이디"));
        p2.add(txtid = new JTextField(12));
        panWest.add(p2);

        p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p3.add(new JLabel("비밀번호"));
        p3.add(txtpwd = new JTextField(12));
        panWest.add(p3);

        p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p4.add(new JLabel("생일"));
        p4.add(txtbirth = new JTextField(12));
        panWest.add(p4);

        add(panWest, "West");

        // button 화면 아래 등록
        panSouth = new JPanel();
        panSouth.add(btncommit = new JButton("회원가입"));
        panSouth.add(btncancel = new JButton("취소"));

        add(panSouth, "South");

        btncommit.addActionListener(this);
        btncancel.addActionListener(this);

        // 테이블 객체 생성
        add(new JScrollPane(table = new JTable()), "Center");
        // close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 메인 창 출력
        setBounds(550, 400, 700, 300); // setSize(W,H); pack();
        setVisible(true);

        dbConnect();
    }

    ///// db setting //////////////////////////////////////////////

    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;
    PreparedStatement pstmtInsert, pstmtDelete;
    PreparedStatement pstmtTotal, pstmtTotalScroll;
    PreparedStatement pstmtSearch, pstmtSearchScroll;

    private String sqlInsert = "INSERT INTO GUSER VALUES ( ?, ?, ?, ?, ?, ?, ? )";
    private String sqlDelete = "DELETE FROM GUSER WHERE U_ID = ?";
    private String sqlSelect = "SELECT  * FROM GUSER";
    private String sqlSearch = "SELECT * FROM GUSER WHERE U_ID= ?";

    public void dbConnect() {
        try {
            conn = dbConnectSingletonHelper.getConnection("oracle"); //

            pstmtInsert = conn.prepareStatement(sqlInsert);
            pstmtDelete = conn.prepareStatement(sqlDelete);
            pstmtTotal = conn.prepareStatement(sqlSearch);
            pstmtSearch = conn.prepareStatement(sqlSearch);

            pstmtTotalScroll = conn.prepareCall(sqlSelect, ResultSet.TYPE_SCROLL_SENSITIVE, // 커서 이동을 자유롭게하고 업데이트 내용을
                    // 반영한다.
                    ResultSet.CONCUR_UPDATABLE); // resultset object의 변경이 가능 <=> CONCUR_READ_ONLY

            pstmtSearchScroll = conn.prepareCall(sqlSearch, ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } // dbConnect() end

    ///////////////////////////////////////////////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btncommit) {
            if (cmd != COMMIT) {
                setText(COMMIT); // user method
                return;
            } // if in
            setTitle(e.getActionCommand());
            try {
                commit();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } // 추가

        } else if (obj == btncancel) {
            System.exit(0);

        }
    }

///////////////// Button Event //////////////////////////////

    public void commit() throws SQLException {

        String strname = txtname.getText();
        String strid = txtid.getText();
        String strpwd = txtpwd.getText();
        String strbirth = txtbirth.getText();

        String sql = "INSERT INTO GUSER (U_NAME, U_ID, U_PWD, BIRTH) VALUES("+"'"+strname+"'"+", "+"'"+strid+"'"+", "+"'"+strpwd+"'"+","+"'"+strbirth+"')";

        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        JOptionPane.showMessageDialog(null, "회원가입완료");

        //닫기
        stmt.close();
        conn.close();
    }//end commit

    //////////////////////////////////////////////////////////
    private void init() { // 초기화 메소드
        txtname.setText("");
        txtname.setEditable(false); // 비활성화
        txtid.setText("");
        txtid.setEditable(false);
        txtpwd.setText("");
        txtpwd.setEditable(false);
        txtbirth.setText("");
        txtbirth.setEditable(false);
    }

    private void setText(int command) { // user method
        switch (command) {
            case COMMIT:
                txtname.setEditable(true);
                txtid.setEditable(true);
                txtpwd.setEditable(true);
                txtbirth.setEditable(true);
                break;
        }// end switch
        setButton(command); // user method
    }// setText() end

    private void setButton(int command) {
        // cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
        btncommit.setEnabled(false);
        btncancel.setEnabled(false);

        switch (command) {
            case COMMIT:
                btncommit.setEnabled(true);
                cmd = COMMIT;
                break;
            case NONE:
                btncommit.setEnabled(true);
                btncancel.setEnabled(true);
                cmd = NONE;
                break;
        }// end switch
    }// end setbutton

    public static void main(String[] args) {
        new new_join();
    }

}
