package algorithm;

import java.util.Scanner;

public class p8958 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int n = 0;
		int sum = 0;
		String[] s = new String[a];

		for (int i = 0; i < a; i++) {
			s[i] = sc.next();
		}

		for (int i = 0; i < a; i++) {
			sum = 0;
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'O') {
					n++;
					sum += n;
				} else {
					n = 0;
				}
			}
			n = 0;
			System.out.println(sum);
		}
	}
}
