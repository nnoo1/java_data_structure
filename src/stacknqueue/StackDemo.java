package stacknqueue;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    System.out.println("===stack===");
//    s.peek();
    s.push(10);
    s.push(20);
    s.push(30);
    while (!s.isEmpty()) {
      System.out.println(s.pop()+);
    }
  }
}
