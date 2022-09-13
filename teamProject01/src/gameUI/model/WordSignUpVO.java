package gameUI.model;

public class WordSignUpVO {
	private String user_name;
	private String user_id;
	private String user_pwd;
	private String user_birth;
	
	public WordSignUpVO() {}
	public WordSignUpVO(String user_name, String user_id, String user_pwd, String user_birth) {
		this.user_name = user_name;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_birth = user_birth;
	}
	
	public WordSignUpVO(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

}
