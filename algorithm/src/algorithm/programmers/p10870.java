package algorithm.programmers;

import java.util.Scanner;

public class p10870 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		System.out.println(fib(a));
	}

	public static int fib(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {
			return fib(i - 1) + fib(i - 2);
		}
	}
}