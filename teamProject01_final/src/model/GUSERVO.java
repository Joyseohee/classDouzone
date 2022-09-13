package model;

public class GUSERVO { // model - ~~VO, ~~DAO, ~~TO

	public final String ClassName = "GUSER";

	//ID,WORD,PART
	private String U_NAME,U_ID,U_PWD,BIRTH,SCORE,RANK,MONEY;
	
	
	public String getU_NAME() {
		return U_NAME;
	}


	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}


	public String getU_ID() {
		return U_ID;
	}


	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}


	public String getU_PWD() {
		return U_PWD;
	}


	public void setU_PWD(String u_PWD) {
		U_PWD = u_PWD;
	}


	public String getBIRTH() {
		return BIRTH;
	}


	public void setBIRTH(String bIRTH) {
		BIRTH = bIRTH;
	}


	public String getSCORE() {
		return SCORE;
	}


	public void setSCORE(String sCORE) {
		SCORE = sCORE;
	}


	public String getRANK() {
		return RANK;
	}


	public void setRANK(String rANK) {
		RANK = rANK;
	}


	public String getMONEY() {
		return MONEY;
	}


	public void setMONEY(String mONEY) {
		MONEY = mONEY;
	}


	public String getClassName() {
		return ClassName;
	}


}
