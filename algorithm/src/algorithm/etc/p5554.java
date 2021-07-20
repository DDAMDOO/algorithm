package algorithm.etc;

import java.util.Scanner;

public class p5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int min = 0;
		int sec = 0;

		sec = (a + b + c + d) % 60;
		min = (a + b + c + d - (a + b + c + d) % 60) / 60;
		System.out.println(min);
		System.out.println(sec);
	}
}