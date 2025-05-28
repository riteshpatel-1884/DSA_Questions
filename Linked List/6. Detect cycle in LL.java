
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        if (head == null || head.next == null)
            return false;
        
        while (fast != null) {
            if(slow.next == null) //agar slow ka next hi null ho jaye to false return kr do
            return false;
            slow = slow.next;
            if(fast.next == null) //agar fast ka next hi null ho jaye to false return kr do
            return false;
            fast = fast.next.next;
            if (slow == fast)
            return true;
        }
        return false;
    }
}
