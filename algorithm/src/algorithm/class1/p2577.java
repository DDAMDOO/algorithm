package algorithm;

import java.util.Scanner;

public class p2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int[] ary = new int[10];
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int sum = a * b * c;
		
		for (int i = 0; i < 9; i++) {
			if(sum != 0) {				
				ary[sum % 10]++;
				sum -= sum % 10;
				sum /= 10;
			}
		}

		for (int i = 0; i <= 9; i++) {
			System.out.println(ary[i]);
		}
	}
}
