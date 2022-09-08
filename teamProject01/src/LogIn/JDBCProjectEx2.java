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
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import db.dbConnectSingletonHelper;

public class JDBCProjectEx2 extends JFrame implements ActionListener {
	// component 객체 선언
	JPanel panWest, panSouth; // 왼쪽텍스트필드, 아래쪽 버튼
	JPanel p1, p2, p3, p4;
	JTextField txtid, txtpw;
	JButton btnCreateid, btnLogin, btnDelete, btnCancel;

	JTable table; // 검색과 전체 보기를 위한 테이블 객체 생성
	// 상태변화를 위한 변수 선언
	private static final int NONE = 0;
	private static final int ADD = 1; // 회원가입
	private static final int LOGIN = 2; // 로그인
	private static final int DELETE = 3; // 회원탈퇴
	private static final int CANCEL = 4; // 취소
	int cmd = NONE; // int com = 0;

	public JDBCProjectEx2() { // 멤버변수 초기화 담당 - 생성자함수
		// component 등록
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("아이디"));
		p1.add(txtid = new JTextField(12));
		panWest.add(p1);

		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("비밀번호"));
		p2.add(txtpw = new JTextField(12));
		panWest.add(p2);

		add(panWest, "West");

		// button 화면 아래 등록
		panSouth = new JPanel();
		panSouth.add(btnCreateid = new JButton("회원가입"));
		panSouth.add(btnLogin = new JButton("로그인"));
		panSouth.add(btnDelete = new JButton("회원탈퇴"));
		panSouth.add(btnCancel = new JButton("취소"));
		add(panSouth, "South");

		// event 처리
		btnCreateid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new_join a =new new_join();
			}
		});
		btnLogin.addActionListener(this);
		
		btnDelete.addActionListener(this);
		
		btnCancel.addActionListener(this);

		// 테이블 객체 생성
		add(new JScrollPane(table = new JTable()), "Center");
		// close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 메인 창 출력
		setBounds(550, 400, 700, 300); // setSize(W,H); pack();
		setVisible(true);

		dbConnect(); // db 연결~
	} // constuctor end

	///// db setting //////////////////////////////////////////////
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	PreparedStatement pstmtInsert, pstmtDelete;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;

	private String sqlInsert = "INSERT INTO GUSER VALUES ( ?, ?, ?, ? )";
	private String sqlDelete = "DELETE FROM GUSER WHERE U_ID = ?";
	private String sqlSelect = "SELECT  * FROM GUSER ";
	private String sqlSearch = "SELECT * FROM GUSER WHERE U_ID  = ?";

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
		if (obj == btnCreateid) {
			if (cmd != ADD) {
				setText(ADD); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			add(); // 추가

		} else if (obj == btnDelete) {
			if (cmd != DELETE) {
				setText(DELETE); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			del(); // 삭제

		} else if (obj == btnLogin) {
			if (cmd != LOGIN) {
				setText(LOGIN);
				return;
			}
			setTitle(e.getActionCommand());
			try {
				login();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		} else if (obj == btnCancel) {
			System.exit(0);
		} // 초기화 메소드, user method
	}// actionPerformed end

	///////////////// Button Event //////////////////////////////

	public void add() {
		try {
			String strid = txtid.getText();
			String strpw = txtpw.getText();

			// System.out.println(strNo + ", " + strName +", " +strMail +", " + strPhone);

//			if( strNo.length() < 1 || strName.length() < 1 ) {
//				JOptionPane.showMessageDialog(null, "번호와 이름은 필수 사항입니다. 입력해주세요. ");
//				return;
//			}
			switch (JOptionPane.showConfirmDialog(null, "(" + strid + ", " + strpw + ")", "추가하시겠습니까? ",
					JOptionPane.YES_NO_OPTION)) {
			case 0: // 확인
				break;
			case 1: // 아니오
				return;
			} // switch end
			pstmtInsert.setInt(1, Integer.parseInt(strid));
			pstmtInsert.setString(2, strpw);

			pstmtInsert.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "추가 됐습니다. ");

		init();
	} // end add()

	public void del() {

	}

	public void login() throws SQLException {

		String strid = txtid.getText();
		String strpw = txtpw.getText();	
		
	    //SQL연결
	
		// 3. DML 명령어 사용 (SELECT GIFT 실습)
		//Statement stmt = conn.createStatement();
		String sql = "select * from GUSER WHERE U_ID = '" + strid + "' and u_pwd= '" + strpw + "'";
		
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		//System.out.println(sql.toString());
	
		if(rs.next()==false) {
			JOptionPane.showMessageDialog(null, "로그인에 실패하였습니다.");
		}else{
			JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
		}
		
		// 4. 닫기
		rs.close();
		stmt.close();
		conn.close();
	}

	//////////////////////////////////////////////////////////

	private void init() { // 초기화 메소드
		txtid.setText("");
		txtid.setEditable(false); // 비활성화
		txtpw.setText("");
		txtpw.setEditable(false);
//		String no = txtNo.getText();
//		System.out.println(no);
	}// init() end

	private void setText(int command) { // user method
		switch (command) {
		case ADD:
			txtid.setEditable(true);
			txtpw.setEditable(true);
			break;
		case DELETE:
		case LOGIN:
			txtid.setEditable(true);
			txtpw.setEditable(true);// 활성화
			break;
		}// switch end

		setButton(command); // user method
	}// setText() end

	private void setButton(int command) {
		// cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
		btnCreateid.setEnabled(false);
		btnLogin.setEnabled(false);
		btnDelete.setEnabled(false);
		btnCancel.setEnabled(false);

		switch (command) {
		case ADD:
			btnCreateid.setEnabled(true);
			cmd = ADD;
			break;
		case DELETE:
			btnDelete.setEnabled(true);
			cmd = DELETE;
			break;

		case LOGIN:
			btnLogin.setEnabled(true);
			cmd = LOGIN;
			break;

		case NONE:
			btnCreateid.setEnabled(true);
			btnDelete.setEnabled(true);
			btnLogin.setEnabled(true);
			btnCancel.setEnabled(true);
			cmd = NONE;
			break;
		}// switch end
	}// setButton end

	public static void main(String[] args) {
		new JDBCProjectEx2();
	}
}
