package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q17878Main2 {
	static String str = "";
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
//		print1(Integer.parseInt(br.readLine()));
		bw.write(strM(2));
		
		bw.close();
		br.close();
	}
	
	public static void print1(int i) throws IOException {
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		printRec1(i);
		printmid(i);
		printRec2(i);
		
	}

	private static void printmid(int i) throws IOException {
		bw.write(strM(i));	bw.write("\"재귀함수가 뭔가요?\"\n");
		bw.write(strM(i));	bw.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
		bw.write(strM(i));	bw.write("라고 답변하였지.\n");
	}

	private static void printRec1(int i) throws IOException {
		if(i == 0) return;
		bw.write(strM(i));	bw.write("\"재귀함수가 뭔가요?\"\n");
		bw.write(strM(i));	bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		bw.write(strM(i));	bw.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		bw.write(strM(i));	bw.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		printRec1(i-1);
		
	}
	
	private static void printRec2(int i) throws IOException {
		if(i == 0) return;
		bw.write(strM(i));	bw.write("라고 답변하였지.\n");
		printRec2(i-1);
		
	}
	
	private static String strM(int i) throws IOException {
		if(i == 0) return str;
		str = "____"+ strM(i-1);
		return str;
	}
	
	
}
