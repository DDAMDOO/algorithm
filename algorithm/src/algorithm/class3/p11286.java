package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class p11286 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				if (Math.abs(a) > Math.abs(b) || Math.abs(a) == Math.abs(b) && a > b) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			int b = Integer.parseInt(br.readLine());
			if (b == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(b);
			}
		}
	}
}