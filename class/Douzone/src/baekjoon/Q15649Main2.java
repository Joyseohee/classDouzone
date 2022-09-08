package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15649Main2 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(rec(N) - 1);
		hanoi(N, 1, 2, 3);
		bw.close();
	}
	
	static int x = 2;
	private static int rec(int i) {
		if(i <= 1) return x;
		x = 2 * rec(i - 1);
		return x;
	}

	public static void hanoi(int N, int a, int b, int c) throws IOException {
		if (N > 0) {
			hanoi(N - 1, a, c, b);
			bw.write(a + " " + c + "\n");
			hanoi(N - 1, b, a, c);
		}
	}
}
