package gameUI.controller;

import gameUI.model.WordSignUpDAO;
import gameUI.model.WordSignUpVO;
import gameUI.view.GameUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class WordSignUp extends JFrame implements ActionListener {

	Font fnt = new Font("굴림체", Font.BOLD, 14);
	Font titleFnt = new Font("굴림체", Font.BOLD, 32);
	JLabel titleLbl = new JLabel("회 원 가 입");
	JLabel nameHanLbl = new JLabel("이름");
	JTextField nameHanField = new JTextField(30);
	JLabel idLbl = new JLabel("아이디");
	JTextField idField = new JTextField(30);
	JButton duplicateBtn = new JButton("중복 확인");
	JLabel pwdLbl = new JLabel("비밀번호");
	JTextField pwdFieldT = new JPasswordField(30);
	JPasswordField pwdField = new JPasswordField(30);
	JLabel pwdcheckLbl = new JLabel("비밀번호 확인");
	JPasswordField pwdcheckField = new JPasswordField(30);
	JTextField pwdcheckFieldT = new JPasswordField(30);
	JLabel BirthLbl = new JLabel("생일");
	JTextField BirthField = new JTextField(30);
	JButton signUpBtn = new JButton("회원가입");
	JButton cancelBtn = new JButton("취소");

	WordSignUpDAO dao = new WordSignUpDAO();
	String Hint = null;

	public WordSignUp() {
		setLayout(null);
		int x = 300; // 회원가입
		int x1 = 410;
		add(titleLbl).setBounds(450, 100, 200, 30);
		titleLbl.setFont(titleFnt);

		add(idLbl).setBounds(x, 200, 100, 30);
		add(idField).setBounds(x1, 200, 250, 30);
		add(duplicateBtn).setBounds(670, 200, 110, 30);
		idLbl.setFont(fnt);
		idField.setFont(fnt);
		Hint = "영문 대소문자 혹은 숫자로 3~8글자";
		hint(idField, Hint);		// 아이디

		duplicateBtn.setFont(fnt);	// 아이디 중복확인 버튼
		duplicateBtn.setBackground(new Color(0, 130, 255));
		duplicateBtn.setForeground(Color.black);

		add(pwdLbl).setBounds(x, 250, 100, 30);
		add(pwdField).setBounds(x1, 250, 250, 30);
		pwdLbl.setFont(fnt);
		pwdField.setFont(fnt);
		Hint = "영문 대소문자 혹은 숫자로 6~15글자";
		hint(pwdField, Hint);		// 비밀번호

		add(pwdcheckLbl).setBounds(x, 300, 100, 30);
		add(pwdcheckField).setBounds(x1, 300, 250, 30);
		pwdcheckLbl.setFont(fnt);
		pwdcheckField.setFont(fnt);	// 비밀번호 확인

		add(nameHanLbl).setBounds(x, 350, 100, 30);
		add(nameHanField).setBounds(x1, 350, 250, 30);
		nameHanLbl.setFont(fnt);
		nameHanField.setFont(fnt);	// 이름

		add(BirthLbl).setBounds(x, 400, 100, 30);
		add(BirthField).setBounds(x1, 400, 250, 30);
		BirthLbl.setFont(fnt);
		BirthField.setFont(fnt);
		Hint = "YYYYMMDD 형식으로 입력해주세요";
		hint(BirthField, Hint);		// 생일

		add(signUpBtn).setBounds(400, 630, 100, 30);
		add(cancelBtn).setBounds(530, 630, 100, 30);
		signUpBtn.setFont(fnt); // 회원가입 버튼
		signUpBtn.setBackground(new Color(0, 130, 255));
		signUpBtn.setForeground(Color.black);
		signUpBtn.setEnabled(false);
		cancelBtn.setFont(fnt); // 취소 버튼
		cancelBtn.setBackground(new Color(0, 130, 255));
		cancelBtn.setForeground(Color.black);

		getContentPane().setBackground(Color.white);
		setSize(1000, 800);
		setVisible(true);

		duplicateBtn.addActionListener(this);
		signUpBtn.addActionListener(this);
		cancelBtn.addActionListener(this);

	}

	// 이벤트 등록
//	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		if (obj instanceof JButton) {
			String btn = e.getActionCommand();
			if (btn.equals("회원가입")) {
				String id = idField.getText();
				String password = pwdField.getText();
				String pwdCheck = pwdcheckField.getText();
				String birth = BirthField.getText();

				if (id.equals("")) {
					JOptionPane.showMessageDialog(this, "아이디를 반드시 입력해주세요.");
				} else if (!Pattern.compile("[0-9a-zA-Z]{3,8}").matcher(id).matches()) {
					JOptionPane.showMessageDialog(this, "아이디가 형식에 맞지 않습니다.\n영문 대소문자 혹은 숫자를 포함해 3~8글자로 다시 입력해주세요.");
				} else if (password.equals("")) {
					JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요");
				} else if (!Pattern.compile("[0-9a-zA-Z]{6,15}").matcher(password).matches()) {
					JOptionPane.showMessageDialog(this, "비밀번호가 형식에 맞지 않습니다.\n영소문자+영대문자+숫자를 합쳐서 6~15자로 다시 입력해주세요");
				} else if (pwdCheck.equals("")) {
					JOptionPane.showMessageDialog(this, "입력하신 비밀번호를 다시 한 번 입력해주세요.");
				} else if (!password.equals(pwdCheck)) {
					JOptionPane.showMessageDialog(this, "입력하신 비밀번호가 일치하지 않습니다.");
				} else if (nameHanField.getText().equals("")) {
					JOptionPane.showMessageDialog(this, "이름을 입력해주세요");
				} else if (birth.equals("")) {
					JOptionPane.showMessageDialog(this, "생일을 입력해주세요.");
				} else if (!Pattern.compile("(19|20)[0-9]{2}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[0-1])").matcher(birth).matches()) {
					JOptionPane.showMessageDialog(this, "형식에 맞지 않습니다. 다시 입력해주세요.\n예시 > 19991015");
				} else {
					WordSignUpVO vo = new WordSignUpVO(nameHanField.getText(), idField.getText(), pwdField.getText(), BirthField.getText());
					int result = dao.SignUpInsert(vo);
					if (result > 0) { // 회원등록 성공함
						JOptionPane.showMessageDialog(this, "회원가입에 성공하였습니다\n원활한 이용을 위하여\n로그인 해주시기 바랍니다");
					} else { // 회원등록 실패함 -> 여기 확인
						JOptionPane.showMessageDialog(this, "회원가입에 실패하였습니다\n 관리자에게 문의해 주시기 바랍니다");
					}
					dispose();
					
					////이부분이 문제, 우리는 객체를 통해서 관리하기 때문에 여기서 새 객체를 열어버리면 이전의 객체의 
				
					GameUI m = new GameUI();
					m.Main1();
					m.setLogincheck(false);
				}
			} else if (btn.equals("취소")) {
				dispose();
				new GameUI();
			} else if (btn.equals("중복 확인")) {	// 아이디 중복확인
				String idSearch = idField.getText();
				System.out.println(idSearch.length());
				if (idSearch.equals("")) {
					JOptionPane.showMessageDialog(this, "아이디를 입력하셔야 합니다");
				} else if(!Pattern.compile("[0-9a-zA-Z]{3,8}").matcher(idSearch).matches()) {
					JOptionPane.showMessageDialog(this, "아이디가 형식에 맞지 않습니다.\n영문 대소문자 혹은 숫자를 포함해 3~8글자로 다시 입력해주세요.");
				} else {    // 중복 확인
					try {
						if (dao.selectID(idSearch)) {
							JOptionPane.showMessageDialog(this, "사용 가능한 아이디 입니다");
							signUpBtn.setEnabled(true);
							idField.setEnabled(false);
						} else {
							JOptionPane.showMessageDialog(this, "등록되어 있는 아이디 입니다");
						}
					} catch (SQLException ex) {
						throw new RuntimeException(ex);
					}
				}
			}

		}
	}
	// 힌트 문자
	public void hint(JTextField Field, String Hint) {

		Font gainFont = new Font("Tahoma", Font.PLAIN, 11);
		Font lostFont = new Font("Tahoma", Font.ITALIC, 11);
		Field.setText(Hint);	// 텍스트 필드 힌트의 기본 문자
		Field.setFont(lostFont);	// 텍스트 필드 힌트의 기본 폰트
		Field.setForeground(Color.GRAY);	// 텍스트 필드 힌트의 기본 색상
		Field.addFocusListener(new FocusListener() {	// 텍스트 필드 포커스 시 이벤트

			@Override
			public void focusLost(FocusEvent e) {	// 포커스를 잃었을 때,
				if (Field.getText().equals("")) {
					Field.setText(Hint);
					Field.setFont(lostFont);
					Field.setForeground(Color.GRAY);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {	// 포커스를 얻었을 때,
				if (Field.getText().equals(Hint)) {
					Field.setText("");
					Field.setFont(gainFont);
					Field.setForeground(Color.BLACK);

				}
			}
		});
	}

}
