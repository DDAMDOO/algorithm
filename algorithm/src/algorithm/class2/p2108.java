package algorithm.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class p2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] index = new int[8001];
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		int min = 4000;
		int max = -4000;
		double sum = 0;

		for (int i = 0; i < a; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sum += list.get(i);
			index[i + 4000]++;
			if (list.get(i) < min) {
				min = list.get(i);
			}
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		Collections.sort(list);
		int idx = 0;
		boolean flag = false;
		for (int i = min + 4000; i <= max + 4000; i++) {
			if (idx < index[i]) {
				idx = index[i];
				flag = true;
			} else if (idx == index[i] && flag == true) {
				idx = index[i];
				flag = false;
			}
		}

		sb.append(Math.round(sum / a) + "\n");
		sb.append(list.get(a / 2) + "\n");
		sb.append(list.get(idx - 1) + "\n");
		sb.append(list.get(a - 1) - list.get(0));

		System.out.println(sb);
	}
}