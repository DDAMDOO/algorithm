package algorithm.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class shark {
	int x;
	int y;

	shark(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class p16236 {
	public static int[][] ary;
	public static int[][] dist;

	public static int a;

	public static int[] nx = { -1, 0, 0, 1 };
	public static int[] ny = { 0, -1, 1, 0 };

	public static int min_x = Integer.MAX_VALUE;
	public static int min_y = Integer.MAX_VALUE;
	public static int min_dist = Integer.MAX_VALUE;

	public static int shark_x;
	public static int shark_y;
	public static int shark_size = 2;
	public static int shark_cnt = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		a = Integer.parseInt(br.readLine());
		ary = new int[a][a];
		dist = new int[a][a];

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a; j++) {
				ary[i][j] = Integer.parseInt(st.nextToken());

				if (ary[i][j] == 9) {
					shark_x = i;
					shark_y = j;
					ary[i][j] = 0;
				}
			}
		}

		int rst = 0;

		for (;;) {
			init();

			bfs(shark_x, shark_y);

			if (min_x != Integer.MAX_VALUE && min_y != Integer.MAX_VALUE) {
				// 탐색을 정상적으로 했을 경우 해당 좌표까지의 이동 거리를 더해줌
				rst += dist[min_x][min_y];

				shark_cnt++;
				// 상어 크기 변경
				if (shark_cnt == shark_size) {
					shark_size++;
					shark_cnt = 0;
				}
				
				ary[min_x][min_y] = 0;

				shark_x = min_x;
				shark_y = min_y;
				//이동한 물고기가 있던 칸의 값을 변경하고 상어 위치를 변경
			} else {
				break;
			}
		}
		System.out.println(rst);
	}

	public static void bfs(int x, int y) {
		Queue<shark> q = new LinkedList<>();
		q.add(new shark(x, y));
		dist[x][y] = 0;// 현재 좌표의 거리

		while (!q.isEmpty()) {
			shark n = q.poll();
			x = n.x;
			y = n.y;

			for (int i = 0; i < 4; i++) {
				int X = x + nx[i];
				int Y = y + ny[i];

				if (X >= 0 && X < a && Y >= 0 && Y < a) {

					if (ary[X][Y] <= shark_size && dist[X][Y] == -1) {// 처음 방문하는 경우 갱신
						dist[X][Y] = dist[x][y] + 1;

						if (ary[X][Y] != 0 && ary[X][Y] < shark_size) {

							if (min_dist > dist[X][Y]) {// 최단거리를 구하는 갱신
								min_x = X;
								min_y = Y;
								min_dist = dist[X][Y];
							} else if (min_dist == dist[X][Y]) {
								if (min_x == X) {// 같은 개체가 존재할 경우 우선순위를 위에있고, 왼쪽에 있는 것으로 지정
									if (min_y > Y) {
										min_x = X;
										min_y = Y;
									}
								} else if (min_x > X) {
									min_x = X;
									min_y = Y;
								}
							}
						}
						q.add(new shark(X, Y));
					}
				}
			}
		}
	}

	public static void init() {
		min_x = Integer.MAX_VALUE;
		min_y = Integer.MAX_VALUE;
		min_dist = Integer.MAX_VALUE;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				dist[i][j] = -1;
			}
		}
	}
}