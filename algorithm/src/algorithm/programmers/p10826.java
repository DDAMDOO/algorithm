package algorithm.programmers;

import java.math.BigInteger;
import java.util.Scanner;

public class p10826 {

	public static BigInteger[] ary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ary = new BigInteger[a + 1];

		ary[0] = BigInteger.ZERO;
		if (ary.length > 1) {
			ary[1] = BigInteger.ONE;
		}
		for (int i = 2; i <= a; i++) {
			ary[i] = ary[i - 2].add(ary[i - 1]);
		}
		System.out.println(ary[a]);
	}
}

