package algorithm.etc;

public class permutation {
	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	static void per1(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			print(arr, r);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			per1(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}

	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	static void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				per2(arr, output, visited, depth + 1, n, r);
				output[depth] = 0; // �� ���� ��� ��
				visited[i] = false;
				;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}