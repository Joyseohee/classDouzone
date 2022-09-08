package ex01.string;

public class StringMain {
	public static void main(String[] args) {
		int x =3, y = 5;
		System.out.println("x = "+x +", y = "+y);
		x = y;
		System.out.println("x = "+x +", y = "+y);
		y = 77;
		System.out.println("x = "+x +", y = "+y);
		
		String s1 = "kosa";
		String s2 = "happy";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		s1 = s2;
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		s1 ="virus";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		s1 ="doyeon";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		s1 ="gildong";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		s1 ="kosa";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		s2 ="gildong";
		System.out.println("s1 = "+s1 +", s2 = "+s2);
		System.out.println("s1 = "+s1.hashCode() +", s2 = "+s2.hashCode());
		
		String s3 = new String("kosa");
		System.out.println("s1 = "+s1 +", s3 = "+s3);
		System.out.println("s1 = "+s1.hashCode() +", s3 = "+s3.hashCode());
		
	}

}
