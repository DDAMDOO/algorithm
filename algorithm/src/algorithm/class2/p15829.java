package algorithm.class2;

import java.util.Scanner;

public class p15829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		long mod = 1234567891;
		long b = 1;
		long sum = 0;

		for (int i = 0; i < s.length(); i++) {
			long k = ((s.charAt(i) - 96) * b) % mod;
			sum += k;
			sum = sum % mod;
			b *= 31;
			b = b % mod;
		}
		System.out.println(sum);
	}
}