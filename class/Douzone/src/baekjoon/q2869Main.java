package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2869Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String all = br.readLine();
		StringTokenizer st = new StringTokenizer(all);
		
		int[] num = new int[3];
		int i = 0;
		
		
		while (st.hasMoreTokens()) {
			num[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		int d = (num[2]-num[0])/(num[0] - num[1]) + 1;
		
		if((num[2]-num[0])%(num[0] - num[1]) != 0 ) d++;
		
		System.out.println(d);
		br.close();
	}

}
