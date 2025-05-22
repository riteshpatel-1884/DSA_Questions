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






class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode slow = head;
      ListNode fast = head;

      for(int i = 0; i<n; i++){
            fast = fast.next;
      }

      if(fast == null){
        head = head.next;
        return head;
      }

      while(fast.next!=null){
        fast = fast.next;
        slow = slow.next;
      }
       slow.next = slow.next.next;
       return head;
    }
}



