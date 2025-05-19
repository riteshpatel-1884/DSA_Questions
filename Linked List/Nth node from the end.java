1. Suppose from end 2nd (5) ko delete krna hai, then 2 pointer slow and fast lange.
2. Initially dono head pe honge.
3. Fast ko nth index pe aage using loop.
4. Then ab slow fast ko ek ek node shift kro until (fast == null) ho jaye.
5. We will get nth index from end at slow pointer.
6. This all will be done in only one traversal.
7. This is called slow fast pointer or torture-rabbit technique


// Method 1: Using One Traversal  
public static Node nthNode(int n, Node head) {
    Node slow = head;
    Node fast = head;
    for (int i = 1; i <= n; i++) 
    {
        fast = fast.next;
    }
    while (fast != null) 
    {
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
}
public static void main() 
{
    System.out.println(nthNode(a, 2));
}










//Method 2: Using Two traversal
1. nth node from end = (m - n + 1)th from start (Using arithmetic progression)
2. m = total node/ size
3. Ex: 2nd from end = 5 - 2 + 1 = 4th from start.
4. Since size niklane ke baad temp head pe nhi hoga so again initialize temp with head.
  

  public static Node nthNode(Node head, int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
        size++;
        temp = temp.next;
    }
    int m = size - n + 1;
    temp = head;
    for (int i = 1; i <= m - 1; i++) {
        temp = temp.next;
    }
    return temp;
}


