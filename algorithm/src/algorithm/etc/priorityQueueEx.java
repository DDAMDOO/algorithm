package algorithm.etc;

import java.util.PriorityQueue;

public class priorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �켱������ ���� ���� ������� ǥ��
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		// �켱������ ���� ���� ������� ǥ��
		// PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

		priorityQueue.add(1); // 1 �߰�
		priorityQueue.add(2); // 2 �߰�
		priorityQueue.offer(3); // 3 �߰�

		priorityQueue.peek(); // ù��° �� ���� = 1

		priorityQueue.poll(); // ù��° ���� ��ȯ�ϰ� ����, ����ִٸ� null
		priorityQueue.remove(); // ù��° �� ����
		priorityQueue.clear(); // �ʱ�ȭ

	}

}
