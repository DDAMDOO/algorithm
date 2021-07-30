package algorithm.greedy;

import java.util.Scanner;

public class p11034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			int cnt = 0;
			
			for (;;) {
				if (b - a == 1 && c - b == 1) {
					System.out.println(cnt);
					break;
				}
				if (b - a < c - b) {
					a = b;
					b += 1;
					cnt++;
				} else {
					c = b;
					b -= 1;
					cnt++;
				}
			}
		}
	}
}