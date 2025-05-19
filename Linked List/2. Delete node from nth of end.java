1. Isme fast ko tail pe rok denge and then we will delete the node by slow.next = slow.next.next.
2. Is code se 1st element from end wala node bhi delete hoga.
3. But last element from end i.e. head will not delete.
4. Example: head = 100, n = 6
5. for (int i = 1; i <= n; i++) 
    {
      fast = fast.next;
    }
6. To yaha fast null pe pahuch jayega kyuki loop 6 baar chalega
7. In while loop, condition is while (fast.next != null) → error came.
8. So agar fast null pe pahuch gaya to iska matlab head ko hi delete karna hai.
9. if (fast == null) 
    {
    head = head.next;
    return;
    }
10. Iska matlab ab niche ka while loop execute nahi hoga.





public static void deleteNthNodeEnd(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for (int i = 1; i <= n; i++) {
        fast = fast.next;
    }

    if (fast == null) {
        head = head.next;
        return;
    }

    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;
}

11. Ek problem ye hai ki abb new ehad 13 ban jayega but printing ke case mein head original wala hi print hoga without 
    deleting 100.
12. So in this case make return type of function Node instead of void and return head in it and after slow.next.

  public static Node deleteNthNodeEnd(______) {
    if (______) {
        ______
        return head;
    }
    while (______) {
        ______
    }
    slow.next = ______
    return head;
}
pvsm(){
  a = deleteNthNodeEnd(a,6);
  sout(a);
}

