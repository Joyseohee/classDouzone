package ex06.oop;

public class MainEntry {
	public static void main(String[] args) {
		//Create Score class object
		Score scr = new Score();
		
		//data value setting
		scr.setName("박서희");
		scr.setKor(80);
		scr.setEng(70);
		scr.setCom(98);
		scr.getTotal();
		scr.getAvg();
		scr.getGrade();
		
		//output
		scr.output();
	}
}
