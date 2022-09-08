package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class q1620Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = new String[N];
        String tmp = null;

        for (int i = 0; i < N; i++) {
            tmp = br.readLine();
            map.put(tmp, i);
            arr[i] = tmp;
        }

        String str = null;
        for (int i = 0; i < M; i++) {
            str = br.readLine();
            try {
                System.out.println(arr[Integer.parseInt(str) - 1]);
            } catch (Exception e) {
                System.out.println(map.get(str) + 1);
            }
        }
        br.close();
    }
}