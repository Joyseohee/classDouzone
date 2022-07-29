package day04_basic;
import java.util.Scanner;

public class time {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int min=sc.nextInt();
		int time=sc.nextInt();
		if((min+time)>=60) {
			if(hour+((min+time)/60)>=24) {
				System.out.println(((hour+((min+time)/60))%24)+" "+((min+time)%60));
			}
			else {
				System.out.println((hour+((min+time)/60))+" "+((min+time)%60));
			}
		}
		else {
			System.out.println(hour+" "+(time+min));
		}
	
		
		
	}

}
