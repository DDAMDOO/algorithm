package algorithm.bruteforce;

import java.util.Scanner;

public class p6131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= 500; i++) {
			for (int j = i; j <= 500; j++) {
				if (i * i + a == j * j) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}