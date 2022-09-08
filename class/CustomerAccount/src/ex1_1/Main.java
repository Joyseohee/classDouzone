package ex1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main extends JFrame implements ActionListener {

    Font titleFnt = new Font("휴먼둥근헤드라인", Font.BOLD, 32);
    Font fnt = new Font("굴림체", Font.BOLD, 14);
    JPanel mainPage = new JPanel();
    JPanel loginPage = new JPanel();
    JPanel topPage = new JPanel();
    JLabel loginTitle = new JLabel("신나는 끝말잇기 게임");
    JPanel centerPage = new JPanel();

    // 이미지
    static ImageIcon icon = new ImageIcon("끝말잇기.PNG"); // 메인화면 사진넣기
    static Image im = icon.getImage();
    Image im2 = im.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
    ImageIcon icon2 = new ImageIcon(im2);
    JLabel lbl = new JLabel(icon2);
    JPanel southPage = new JPanel();
    JPanel southCenterPage = new JPanel();
    JPanel idPane = new JPanel();
    JLabel idLbl = new JLabel("USERNAME");
    static JTextField idField = new JTextField(20);
    JPanel pwdPane = new JPanel();
    JLabel pwdLbl = new JLabel("PASSWORD");
    JPasswordField pwdField = new JPasswordField(20);
    JPanel btnPage = new JPanel();
    JButton joinBtn = new JButton("회원가입");
    JButton loginBtn = new JButton("로그인");

    JPanel mainSouthPage = new JPanel();

    /////////////////// 레이아웃//////////////////////

    public Main() {

        add(mainPage);

        // 메인 패널 레이아웃 그리드백레이아웃
        mainPage.setLayout(new GridBagLayout());

        // 그리드백 제약사항을 정의
        GridBagConstraints gbc = new GridBagConstraints();

        // 전체를 그리드백레이웃으로 채운다
        gbc.fill = GridBagConstraints.BOTH;

        // grid top
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPage.add(loginPage, gbc);
        loginPage.setLayout(new BorderLayout());
        loginPage.add(loginTitle);

        // 제목 폰트 설정
        loginTitle.setFont(titleFnt);
        loginTitle.setHorizontalAlignment(JLabel.CENTER);
//					loginTitle.setVerticalAlignment(JLabel.BOTTOM);
        loginPage.setBackground(Color.white);

        // grid center
        gbc.weightx = 1.0;
        gbc.weighty = 3.0;
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPage.add(centerPage, gbc);
        centerPage.setLayout(new BorderLayout());
        centerPage.add(lbl);
        centerPage.setBackground(Color.white);

        // grid south
        gbc.weightx = 1.0;
        gbc.weighty = 2.0;
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPage.add(southPage, gbc);
        southCenterPage.setLayout(new GridLayout(3, 1));

        // 아이디 패널
        southCenterPage.add(idPane);
        idPane.add(idLbl);
        idPane.add(idField);
        idPane.setFont(fnt);
        idPane.setBackground(Color.white);
        // 패스워드 패널
        southCenterPage.add(pwdPane);
        pwdPane.add(pwdLbl);
        pwdPane.add(pwdField);
        pwdPane.setFont(fnt);
        pwdPane.setBackground(Color.white);

        // 회원가입 로그인 버튼 패널
        southCenterPage.add(btnPage);
        btnPage.add(joinBtn);
        joinBtn.setBackground(new Color(0, 130, 255));
        joinBtn.setForeground(Color.white);
        btnPage.add(loginBtn);
        loginBtn.setBackground(new Color(0, 130, 255));
        loginBtn.setForeground(Color.white);
        btnPage.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnPage.setBackground(Color.white);
        southPage.add(southCenterPage);
        southPage.setBackground(Color.white);
        southCenterPage.setBackground(Color.white);

        // 메인 창 출력
        setBounds(550, 300, 600, 550); // setSize(W,H); pack();
        setVisible(true);

        // 이벤트
        joinBtn.addActionListener(this);
        loginBtn.addActionListener(this);

    }
}

//////////////////////////이벤트 등록//////////////////////

    public void actionPerformed(ActionEvent e) {
        Object eventBtn = e.getSource();
        if (eventBtn == joinBtn) {
            dispose();
            new SignUp();
        } else if (eventBtn == loginBtn) {
            // getLoginData();
        }

    }

//DB CONNECT

    ///// db setting //////////////////////////////////////////////
    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;
    PreparedStatement pstmtInsert, pstmtDelete;
    PreparedStatement pstmtTotal, pstmtTotalScroll;
    PreparedStatement pstmtSearch, pstmtSearchScroll;

    private String sqlInsert = "INSERT INTO LOGIN VALUES ( ?, ?, ?, ? )";
    private String sqlDelete = "DELETE FROM LOGIN WHERE ID = ?";
    private String sqlSelect = "SELECT  * FROM LOGIN";
    private String sqlSearch = "SELECT * FROM LOGIN WHERE ID  = ?";

    public void dbConnect() {
        try {
            conn = ConnectionSingletonHelper.getConnection("oracle"); //

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

//////////////////////////////////////////////////

    public static void main(String[] args) {
        new Main();
    }
}
