public class LinkedList {
  static class Node {
    int data;
    Node next;

    Node(int val) {
      this.data = val;
      this.next = null;
    }
  }
  Node head = null;
  Node tail = null;

  void insert(int val) {
    Node temp = new Node(val);
    if (head == null) {
      tail = head = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
  }
  public static Node nthFromEnd(int n, Node head) {
    if (head == null || n <= 0)
      return null;

    Node fast = head;
    Node slow = head;

    for (int i = 0; i < n; i++) {
      if (fast!= null)
      fast = fast.next;
    }

    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }

    return slow;
  }

  void display() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String[] args) {
    LinkedList obj = new LinkedList();
    obj.insert(3);
    obj.insert(5);
    obj.insert(7);
    obj.insert(9);
    obj.insert(11);
    obj.display();

    int n = 2;
    Node result = nthFromEnd(n, obj.head);
    if (result != null) {
      System.out.println(n + "th node from end is: " + result.data);
    } else {
      System.out.println("Invalid value of n or list is too short.");
    }
  }
}
