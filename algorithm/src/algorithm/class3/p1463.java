package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1463 {
	public static Integer[] ary;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		ary = new Integer[a + 1];

		ary[0] = 0;
		ary[1] = 0;
		System.out.println(func(a));
	}

	public static int func(int a) {
		if(ary[a] == null) {			
			if (a % 6 == 0) {
				ary[a] = Math.min(func(a / 3), Math.min(func(a / 2), func(a - 1))) + 1;
			} else if (a % 3 == 0) {
				ary[a] = Math.min(func(a / 3), func(a - 1)) + 1;
			} else if (a % 2 == 0) {
				ary[a] = Math.min(func(a / 2), func(a - 1)) + 1;
			} else {
				ary[a] = func(a - 1) + 1;
			}
		}
		return ary[a];
	}
}