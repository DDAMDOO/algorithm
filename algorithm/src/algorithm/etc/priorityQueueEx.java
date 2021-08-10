package algorithm.etc;

import java.util.PriorityQueue;

public class priorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 우선순위가 낮은 숫자 순서대로 표현
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		// 우선순위가 높은 숫자 순서대로 표현
		// PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

		priorityQueue.add(1); // 1 추가
		priorityQueue.add(2); // 2 추가
		priorityQueue.offer(3); // 3 추가

		priorityQueue.peek(); // 첫번째 값 참조 = 1

		priorityQueue.poll(); // 첫번째 값을 반환하고 제거, 비어있다면 null
		priorityQueue.remove(); // 첫번째 값 제거
		priorityQueue.clear(); // 초기화

	}

}
