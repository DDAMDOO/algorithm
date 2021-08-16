package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class p7662 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			int n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				String idx = st.nextToken();
				int num = Integer.parseInt(st.nextToken());

				if (idx.equals("I")) {
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else {
					if (map.isEmpty()) {
						continue;
					}
					if (num == 1) {
						if (map.get(map.lastKey()) == 1) {
							map.remove(map.lastKey());
						} else {
							map.put(map.lastKey(), map.get(map.lastKey()) - 1);
						}
					} else {
						if (map.get(map.firstKey()) == 1) {
							map.remove(map.firstKey());
						} else {
							map.put(map.firstKey(), map.get(map.firstKey()) - 1);
						}
					}
				}
			}

			if (map.isEmpty()) {
				System.out.println("EMPTY");
			} else {
				System.out.println(map.lastKey() + " " + map.firstKey());
			}
		}
	}
}