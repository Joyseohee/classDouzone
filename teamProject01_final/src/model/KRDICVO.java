package model;

public class KRDICVO { // model - ~~VO, ~~DAO, ~~TO

	public final String ClassName = "KRDIC";

	//ID,WORD,PART
	private int ID;
	private String WORD,PART;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getWORD() {
		return WORD;
	}
	public void setWORD(String wORD) {
		WORD = wORD;
	}
	public String getPART() {
		return PART;
	}
	public void setPART(String pART) {
		PART = pART;
	}
	public String getClassName() {
		return ClassName;
	}


}
