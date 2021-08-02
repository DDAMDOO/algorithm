package algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class p2061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger k = new BigInteger(st.nextToken());
		long l = Long.parseLong(st.nextToken());

		boolean[] prime = new boolean[(int) l];
		for (int i = 2; i < l; i++) {
			if (prime[i]) {
				continue;
			} else if (k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
				System.out.println("BAD " + i);
				return;
			} else {
				for (int j = i; j < prime.length; j += i)
					prime[j] = true;
			}
		}
		System.out.println("GOOD");
	}
}