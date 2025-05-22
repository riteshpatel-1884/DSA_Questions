//Using ExtraSpace



//Using middle element
class Solution {
  //reversing the LL from middle.next
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = null;
        while(curr!=null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
  public boolean isPalindrome(ListNode head) {
    //finding the middle node of LL
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!=null && fast.next.next!=null) {
        slow = slow.next;   //we will get middle element at slow pointer.
        fast = fast.next.next; 
    }

    ListNode temp = reverse(slow.next); //sending the node after middle node to reverse from it.
    slow.next = temp;  // after reversing the LL from middle.next, then connecting it to the middle element.
    ListNode p1 = head;  //taking a pointer p1 at head to compare it to pointer p2 which is at middle.next node
    ListNode p2 = slow.next;
    while(p2!=null) {   // jab tak p2 null nhi hota hai tab tak compare karte jao 
        if(p1.val!=p2.val) return false;   // agar equal nhi hote hai to break the loop and return false
        p1 = p1.next;  // agar eqaul hote hai to next node pe p1 p2 ko le jao
        p2 = p2.next;
    }
return true;   // it means LL is palindrome.
} 
}
