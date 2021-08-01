package algorithm.etc;

public class permutation_1 {
	static void per2(int[] ary, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			for (int i = 0; i < r; i++)
				System.out.print(output[i] + " ");
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = ary[i];
				per2(ary, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {1, 2, 3};
		int[] rst = new int[ary.length];
		boolean[] visited = new boolean[ary.length];
		
		per2(ary, rst, visited, 0, 3, 2);
	}

}
