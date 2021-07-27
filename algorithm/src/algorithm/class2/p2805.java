package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class p2805 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list);

		int left = 1;
		int right = list.get(a - 1);

		while (left <= right) {
			long h = 0;
			int mid = (left + right) / 2;

			for (int i = 0; i < a; i++) {
				if (list.get(i) >= mid) {
					h += (list.get(i) - mid);
				}
			}

			if (h >= b) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println(right);
	}
}