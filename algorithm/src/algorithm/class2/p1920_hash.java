package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p1920_hash {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int a = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int b = Integer.parseInt(br.readLine());
		int [] ary = new int [b];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < b; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
			if(set.contains(ary[i])) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}