package algorithm.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1059 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int[] ary = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
		}
		int n = Integer.parseInt(br.readLine());
		Arrays.sort(ary);
		for (int i = a-1; i >0; i--) {
			
		}
		System.out.println("0");
	}
}