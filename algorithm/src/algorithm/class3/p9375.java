package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class p9375 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			String[][] ary = new String[b][2];
			Map<String, Integer> map = new HashMap<>();

			for (int j = 0; j < b; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String cloth = st.nextToken(); // 사용안함
				String kind = st.nextToken();

				if (map.containsKey(kind)) {
					map.put(kind, map.get(kind) + 1);
				} else {
					map.put(kind, 1);
				}
			}
			int rst = 1;

			for (int val : map.values()) {
				rst *= (val + 1);
			}
			System.out.println(rst - 1);
		}
	}
}