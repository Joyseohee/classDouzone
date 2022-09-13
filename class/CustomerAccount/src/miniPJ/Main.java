package miniPJ;

import miniPJ.login.WordLoginDAO;
//import miniPJ.score.WordScoreDAO;
import miniPJ.signup.WordSignUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

	Font titleFnt = new Font("휴먼둥근헤드라인", Font.BOLD, 32);
	Font fnt = new Font("굴림체", Font.BOLD, 14);
	JPanel mainPage = new JPanel();
	JPanel loginPage = new JPanel();
	JPanel topPage = new JPanel();
	JLabel loginTitle = new JLabel("끝말잇기 게임");
	JPanel centerPage = new JPanel();

	// 이미지
	 ImageIcon icon = new ImageIcon("끝말잇기.PNG"); // 메인화면 사진넣기
	 Image im = icon.getImage();
	Image im2 = im.getScaledInstance(250, 250, Image.SCALE_DEFAULT);
	ImageIcon icon2 = new ImageIcon(im2);
	JLabel lbl = new JLabel(icon2);
	JPanel southPage = new JPanel();
	JPanel southCenterPage = new JPanel();
	JPanel idPane = new JPanel();
	JLabel idLbl = new JLabel("USERID");
	 JTextField idField = new JTextField(20);
	JPanel pwdPane = new JPanel();
	JLabel pwdLbl = new JLabel("PASSWORD");
	 JPasswordField pwdField = new JPasswordField(20);
	JPanel btnPage = new JPanel();
	JButton joinBtn = new JButton("회원가입");
	JButton loginBtn = new JButton("로그인");

	JPanel mainSouthPage = new JPanel();

	// 변수

	static String uid;

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
		joinBtn.setBackground(Color.gray);
		joinBtn.setForeground(Color.black);
		btnPage.add(loginBtn);
		loginBtn.setBackground(Color.gray);
		loginBtn.setForeground(Color.black);
		btnPage.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnPage.setBackground(Color.white);
		southPage.add(southCenterPage);
		southPage.setBackground(Color.white);
		southCenterPage.setBackground(Color.white);

		// 메인 창 출력
		setBounds(550, 300, 600, 550); // setSize(W,H); pack();
		setVisible(true);
		
		setIconImage(im);
		
		// 이벤트
		joinBtn.addActionListener(this);
		loginBtn.addActionListener(this);

	}

	//////////////////////////이벤트 등록//////////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventBtn = e.getSource();
		if (eventBtn == joinBtn) {
			dispose();
			new WordSignUp();
		} else if (eventBtn == loginBtn) {
			 getLoginData();
		}

	}

	////////////////////////// 로그인 db //////////////////////

	
	public void getLoginData() {
		String user_id = idField.getText();
		String user_pwd = pwdField.getText();
		WordLoginDAO dao = new WordLoginDAO();
		int customLogin = 0;

		int loginCheck = dao.getLogin(user_id, user_pwd);
		if (loginCheck == 0) JOptionPane.showMessageDialog(this, "아이디 또는 비밀번호가 틀렸습니다.");
		else if (loginCheck == 1) {
			customLogin = 1;
			JOptionPane.showMessageDialog(this, "로그인에 성공했습니다!");
			getid(user_id);
			dispose();
		}

		if (customLogin == 0) {
			if (user_id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력하셔야 합니다");
			} else if(user_pwd.equals("")) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하셔야 합니다.");
			} else {
				loginCheck = dao.getLogin(user_id, user_pwd);
				if(loginCheck ==1 ) {
					dispose(); // main 종료
//                    Thread sta = new Thread(new CustomFrame());
//                    sta.start();// customframe 시작
				}
			}
		}
	}

	public void getid(String user_id) {
		uid = user_id;
	}

	public String getid(){
		String id= uid;
		return id;
	}
//
//	public void getScore() {
//		WordScoreDAO dao = new WordScoreDAO();
//
//	}

	public static void main(String[] args) {
		new Main();
	}
}
