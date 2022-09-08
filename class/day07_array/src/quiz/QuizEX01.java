package quiz;


// 문제1] int[] arr = {1, 7, 3, 99, 7, 9, 7, 5, 3, 7, 7, 90, 30, 70} 중 7의 개수 구하기 
public class QuizEX01 {
	public static void main(String[] args) {
		int[] arr = {1, 7, 3, 99, 7, 9, 7, 5, 3, 7, 7, 90, 30, 70};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 7) count ++;
		}
		System.out.println("7의 개수는 " + count + "개");
	}
}
