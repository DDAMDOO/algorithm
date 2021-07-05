package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		String[] ary = new String[a];

		for (int i = 0; i < a; i++) {
			ary[i] = br.readLine();
		}
		for (int i = 0; i < a; i++) {
			int cnt = 0;
			boolean flag = false;
			for (int j = 0; j < ary[i].length(); j++) {
				if (ary[i].charAt(j) == '(') {
					cnt++;
				} else {
					cnt--;
				}
				if (cnt < 0) {
					flag = true;
				}
			}
			if (cnt == 0 && flag == false) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}