1. Find length of both LL
l1 = 6
l2 = 5

2. Increment the larger LL by |l1 - l2| steps. In this proceed LL1 is larger so increase it by 1 step → (6-5 = 1)
3. By doing this, both will start from same position i.e., from 2nd element of LL1 and 1st element of LL2
4. Now just check jab (tempA == tempB) ho jaye to us node ko return kar do. either return tempA or tempB as both will be same.




public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA!=null){
            sizeA++;
            tempA = tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB = tempB.next;
        }
         tempA = headA;
         tempB = headB;
        if(sizeA>sizeB){
            for(int i =0;i<(sizeA-sizeB);i++)
                tempA = tempA.next;
        }
        else{
            for(int i =0;i<(sizeB-sizeA);i++)
                tempB = tempB.next;
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
