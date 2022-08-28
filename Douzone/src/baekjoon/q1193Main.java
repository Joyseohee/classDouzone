package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1193Main {
//	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int i = 1;
		int k = 1;
		while(X > 0) {
			if(X - i < 1) {
				k = X - i - 1;
				if(i % 2 == 0) System.out.println(i + k + 1 + "/" + - k);
				else System.out.println( -k + "/" +  (i + k + 1));
				break;
			}
			X -= i;
			i++;
		}
	}
}
