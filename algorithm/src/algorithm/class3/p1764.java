package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class p1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		HashSet<String> hear = new HashSet<>();

		for (int i = 0; i < a; i++) {
			hear.add(br.readLine());
		}
		int cnt = 0;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < b; i++) {
			String s = br.readLine();
			if (hear.contains(s)) {
				cnt++;
				list.add(s);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}