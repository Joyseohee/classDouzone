package model;

public class DeptVO {	// model - ~~VO, ~~DAO, ~~TO
	
	public final String ClassName = "DEPT";
	
	private int DEPTNO;
	private String DNAME;
	private String LOC;
	
	
	// Setter/Getter method

	public String getClassName() {
		return ClassName;
	}

	public int getDEPTNO() {
		return DEPTNO;
	}

	public void setDEPTNO(int DEPTNO) {
		this.DEPTNO = DEPTNO;
	}

	public String getDNAME() {
		return DNAME;
	}

	public void setDNAME(String DNAME) {
		this.DNAME = DNAME;
	}

	public String getLOC() {
		return LOC;
	}

	public void setLOC(String LOC) {
		this.LOC = LOC;
	}
}
