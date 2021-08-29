package algorithm.etc;

import java.util.Scanner;

public class p1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int cnt = 1;
		int k = (a % 10) * 10 + (a % 10 + a / 10) % 10;
		while (k != a) {
			k = (k % 10) * 10 + (k % 10 + k / 10) % 10;
			cnt++;
		}

		System.out.println(cnt);
	}
}