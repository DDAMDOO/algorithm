package algorithm.greedy;

public class coinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 164;
		int ary[] = { 1, 5, 10, 50 };

		int cnt = 0;
		for (int i = ary.length - 1; i >= 0; i--) {
			while (N > 0) {
				if (N >= ary[i]) {
					N -= ary[i];
					cnt++;
				} else {
					break;
				}
			}
		}
		System.out.println(cnt);// 코인의 개수

		int n = 164;
		int ary1[][] = { { 1, 0 }, { 5, 0 }, { 10, 0 }, { 50, 0 } };

		for (int i = ary1.length - 1; i >= 0; i--) {
			while (n > 0) {
				if (n >= ary1[i][0]) {
					n -= ary1[i][0];
					ary1[i][1]++;
				} else {
					break;
				}
			}
		}
		for (int i = 0; i < ary1.length; i++) {
			System.out.println(ary1[i][1]);//각각의 코인의 개수
		}
	}
}