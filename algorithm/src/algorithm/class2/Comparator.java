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
      public int compareTo(Node o) { //오름차순
         return age - o.age;
      }
   }
   static ArrayList <Node> list = new ArrayList<>();
   static Integer[] list2 = new Integer[4];
   public static void main(String[] args) {
      //클래스 쓸때
      list.add(new Node(10,"손자"));
      list.add(new Node(70,"할아버지"));
      list.add(new Node(45,"아버지"));
      list.add(new Node(44,"어머니"));
      list.add(new Node(10,"손녀"));
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
      
      //int쓸때
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
      
      Arrays.sort(list2,Collections.reverseOrder()); //주의! reverseOreder()쓰려면 int[]가 아닌 Integer[]여야 쓸수 있음.
      sb = new StringBuilder();
      for(int i : list2) {
         sb.append(i).append("\n");
      }
      System.out.println(sb);
   }
}