package algorithm.class2;

import java.util.Scanner;

public class p2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i < a; i++) {
			int sum = 0;
			int k = i;
			while (k != 0) {
				sum += k % 10;
				k /= 10;
			}
			if (sum + i == a) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");
	}

}
