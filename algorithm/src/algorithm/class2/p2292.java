package algorithm.class2;

import java.util.Scanner;

public class p2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			sum += i;
			if (sum * 6 + 1 >= a) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}