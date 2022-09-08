package baekjoon;

import java.util.Scanner;

public class day13Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int[] alph = new int[26];
		String s = sc.nextLine();
		
		// create an array to store how many char is.
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 97) 
				alph[s.charAt(i) - 97] ++;
			else
				alph[s.charAt(i) - 65] ++; 
		}
		
		int Max = -1;	// absolutely smaller than alph[i]
		char MaxCh = '0';
		
		for (int i = 0; i < alph.length; i++) {
			if(alph[i] > Max) {	// find the biggest num
				Max = alph[i];
				MaxCh = (char)(65 + i);	// find the most num of char
			}
			else if(alph[i] == Max) MaxCh = '?'; // if it has several char which has Max
		}

		System.out.println(MaxCh);
	}
}
