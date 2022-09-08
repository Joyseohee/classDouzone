package model;

public class SignInVO {

    // @ field/ Member variables
    public final String ClassName = "GUSER";
    private String U_NAME;
    private String U_ID;
    private String U_PWD;
    private String BIRTH;
    private String SCORE;
    private String RANK;
    private String MONEY;

    // @ getter/setter method
    public String getClassName() {
        return ClassName;
    }

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

    public void setBIRTH(String BIRTH) {
        this.BIRTH = BIRTH;
    }

    public String getSCORE() {
        return SCORE;
    }

    public void setSCORE(String SCORE) {
        this.SCORE = SCORE;
    }

    public String getRANK() {
        return RANK;
    }

    public void setRANK(String RANK) {
        this.RANK = RANK;
    }

    public String getMONEY() {
        return MONEY;
    }

    public void setMONEY(String MONEY) {
        this.MONEY = MONEY;
    }

}
