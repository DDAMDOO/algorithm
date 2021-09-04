package algorithm.etc;

import java.io.IOException;
import java.util.Scanner;

public class p2588 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		int n = Integer.parseInt(a);

		for (int i = 0; i < b.length(); i++) {
			char k = b.charAt(b.length() - i - 1);
			k -= '0';
			System.out.println((int) (n * k));
		}
		System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
	}
}