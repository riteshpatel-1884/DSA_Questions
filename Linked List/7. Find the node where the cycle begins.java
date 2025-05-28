

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null)
            return null;

        while (fast != null) {
            if (slow.next == null)
                return null;
            slow = slow.next;
            if (fast.next == null)
                return null;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != temp) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
