package baekjoon;

/*
한수는 지금 (x, y)에 있다.
직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1085Main {
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String all = br.readLine();
        StringTokenizer st = new StringTokenizer(all);

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int t1 = h - y;
        int t2 = w - x;

        // output
        if(t1 < x && t1 < y && t1 < t2) System.out.println(t1);
        else if(t2 < x && t2 < y && t2< t1) System.out.println(t2);
        else if(x < t2 && x < y && x < t1) System.out.println(x);
        else System.out.println(y);
    }
}
