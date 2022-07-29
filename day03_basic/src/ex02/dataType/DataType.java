package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		short sh = -32768;
		int su = 32768;
		
		System.out.println((short)su + ", " + su);
		
		su = sh;	// 묵시적(자동) 형변환
		sh = (short)su;	//명시적 형변환 - 데이터 손실 발생
		
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
//		flag = 1;
		
	}
}


