package algorithm.programmers;

import java.util.Scanner;

public class p2748 {
	public static long[] ary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ary = new long[a + 1];
		for(int i = 0; i < a + 1; i++) {
			ary[i] = -1;
		}

		ary[0] = 0;
		if(ary.length > 1) {			
			ary[1] = 1;
		}
		System.out.println(fib(a));
	}

	public static long fib(int i) {
		if (ary[i] == -1) {
			return ary[i] = fib(i - 1) + fib(i - 2);
		} else {
			return ary[i];
		}
	}
}