package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p1620 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, String> map = new HashMap<>();

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = 0; i < a; i++) {
			String s = Integer.toString(i + 1);
			String val = br.readLine();
			map.put(s, val);
			map.put(val, s);
		}
		for (int i = 0; i < b; i++) {
			System.out.println(map.get(br.readLine()));
		}
	}
}