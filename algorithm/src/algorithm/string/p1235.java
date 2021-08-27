package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p1235 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		String[] ary = new String[a];

		for (int i = 0; i < a; i++) {
			ary[i] = br.readLine();
		}

		HashSet<String> set = new HashSet<>();
		int len = ary[0].length();
		int idx = len - 1;

		for (int i = 1; i <= len; i++) {
			int cnt = 0;
			for (int j = 0; j < a; j++) {
				if (!set.contains(ary[j].substring(idx))) {
					set.add(ary[j].substring(idx, idx + i));
					cnt++;
				}
			}
			if (cnt == a) {
				System.out.println(i);
				return;
			} else {
				idx--;
				set.clear();
			}
		}
	}
}