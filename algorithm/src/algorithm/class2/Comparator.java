package algorithm.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparator {
   static class Node implements Comparable<Node>{
      int age;
      String name;
      Node(int a,String n){
         age = a;
         name = n;
      }
      @Override
      public int compareTo(Node o) { //��������
         return age - o.age;
      }
   }
   static ArrayList <Node> list = new ArrayList<>();
   static Integer[] list2 = new Integer[4];
   public static void main(String[] args) {
      //Ŭ���� ����
      list.add(new Node(10,"����"));
      list.add(new Node(70,"�Ҿƹ���"));
      list.add(new Node(45,"�ƹ���"));
      list.add(new Node(44,"��Ӵ�"));
      list.add(new Node(10,"�ճ�"));
      Collections.sort(list);
      StringBuilder sb = new StringBuilder();
      for(Node n : list) {
         sb.append(n.age).append(" ").append(n.name).append("\n");
      }
      System.out.println(sb);
      
      sb = new StringBuilder();
      Collections.sort(list,Collections.reverseOrder());
      for(Node n : list) {
         sb.append(n.age).append(" ").append(n.name).append("\n");
      }
      System.out.println(sb);
      
      //int����
      list2[0] = 5;
      list2[1] = 3;
      list2[2] = 1;
      list2[3] = 7;
      Arrays.sort(list2);
      sb = new StringBuilder();
      for(int i : list2) {
         sb.append(i).append("\n");
      }
      System.out.println(sb);
      
      Arrays.sort(list2,Collections.reverseOrder()); //����! reverseOreder()������ int[]�� �ƴ� Integer[]���� ���� ����.
      sb = new StringBuilder();
      for(int i : list2) {
         sb.append(i).append("\n");
      }
      System.out.println(sb);
   }
}