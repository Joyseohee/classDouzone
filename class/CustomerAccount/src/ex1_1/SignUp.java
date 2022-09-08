package ex1_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {

	Font fnt = new Font("굴림체", Font.BOLD, 14);
	Font titleFnt = new Font("굴림체", Font.BOLD, 32);
	JLabel titleLbl = new JLabel("회 원 가 입");
	JLabel idLbl = new JLabel("ID");
	JTextField idField = new JTextField(30);
	JButton duplicateBtn = new JButton("PW");
	JLabel pwdLbl = new JLabel("PW 확인");
	JPasswordField pwdField = new JPasswordField(30);
	JLabel pwdcheckLbl = new JLabel("비밀번호 확인");
	JPasswordField pwdcheckField = new JPasswordField(30);
	JLabel nameHanLbl = new JLabel("이름");
	JTextField nameHanField = new JTextField(30);
	JLabel nameBirthLbl = new JLabel("생일");
	JTextField nameBirthField = new JTextField(30);
	JButton signUpBtn = new JButton("회원가입");
	JButton cancelBtn = new JButton("취소");

	WordSignUpDAO dao = new WordSignUpDAO();

	
	public SignUp() {
		setLayout(null);
		int x = 300; // 회원가입
		int x1 = 410;
		add(titleLbl).setBounds(450, 100, 200, 30);
		titleLbl.setFont(titleFnt);

		add(idLbl).setBounds(x, 200, 100, 30);
		add(idField).setBounds(x1, 200, 250, 30);
		add(duplicateBtn).setBounds(670, 200, 110, 30);
		idLbl.setFont(fnt);
		idField.setFont(fnt); // 아이디

		duplicateBtn.setFont(fnt); // 아이디 중복확인 버튼
		duplicateBtn.setBackground(new Color(0, 130, 255));
		duplicateBtn.setForeground(Color.white);

		add(pwdLbl).setBounds(x, 250, 100, 30);
		add(pwdField).setBounds(x1, 250, 250, 30);
		pwdLbl.setFont(fnt);
		pwdField.setFont(fnt); // 비번

		add(pwdcheckLbl).setBounds(x, 300, 100, 30);
		add(pwdcheckField).setBounds(x1, 300, 250, 30);
		pwdcheckLbl.setFont(fnt);
		pwdcheckField.setFont(fnt); // 비번 두번 입력 확인

		add(nameHanLbl).setBounds(x, 350, 100, 30);
		add(nameHanField).setBounds(x1, 350, 250, 30);
		nameHanLbl.setFont(fnt);
		nameHanField.setFont(fnt); // 이름

		add(nameBirthLbl).setBounds(x,400,100,30);
		add(nameBirthField).setBounds(x1,400,250,30);
		nameBirthLbl.setFont(fnt);
		nameBirthField.setFont(fnt);

		add(signUpBtn).setBounds(400, 630, 100, 30);
		add(cancelBtn).setBounds(530, 630, 100, 30);
		signUpBtn.setFont(fnt); // 회원가입 버튼
		signUpBtn.setBackground(new Color(0, 130, 255));
		signUpBtn.setForeground(Color.white);
		signUpBtn.setEnabled(false);
		cancelBtn.setFont(fnt); // 취소 버튼
		cancelBtn.setBackground(new Color(0, 130, 255));
		cancelBtn.setForeground(Color.white);

		getContentPane().setBackground(Color.white);
		setSize(1000, 800);

		setVisible(true);

		duplicateBtn.addActionListener(this);
		signUpBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
	}

//	////////////////////이벤트 등록
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//}
