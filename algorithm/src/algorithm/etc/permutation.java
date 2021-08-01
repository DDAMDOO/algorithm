package algorithm.etc;

public class permutation {
	static void per1(int[] ary, int depth, int n, int r) {
		if (depth == r) {
			// 마지막 회차
			for (int i = 0; i < r; i++) {
				System.out.print(ary[i] + " ");
			}
			System.out.println("\n");
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(ary, depth, i);
			per1(ary, depth + 1, n, r);
			swap(ary, depth, i);
		}
	}

	static void swap(int[] ary, int depth, int i) {
		int temp = ary[depth];
		ary[depth] = ary[i];
		ary[i] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = { 1, 2, 3 };
		per1(ary, 0, 3, 2);
	}
}