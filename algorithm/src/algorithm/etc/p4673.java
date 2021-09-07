package algorithm.etc;

public class p4673 {
	public static boolean[] visited = new boolean[10001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10000; i++) {
			d(i);
		}
		for(int i=1;i<=10000;i++) {
			if(visited[i] == false)
				System.out.println(i);
		}
	}

	public static void d(int n) {
		int a = n;
		while (n > 0) {
			a += n % 10;
			n /= 10;
		}
		if (a <= 10000) {
			visited[a] = true;
		}
	}
}