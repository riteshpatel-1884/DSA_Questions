1. Find length of both LL
l1 = 6
l2 = 5

2. Increment the larger LL by |l1 - l2| steps. In this proceed LL1 is larger so increase it by 1 step → (6-5 = 1)
3. By doing this, both will start from same position i.e., from 2nd element of LL1 and 1st element of LL2
4. Now just check jab (tempA == tempB) ho jaye to us node ko return kar do. either return tempA or tempB as both will be same.



Node tempA = headA;  
Node tempB = headB;  
int lengthA = 0;

while (tempA != null) {
    lengthA++;
    tempA = tempA.next;
}

int lengthB = 0;
while (tempB != null) {
    lengthB++;
    tempB = tempB.next;
}

tempA = headA;
tempB = headB;
if (lengthA > lengthB) {
    int steps = lengthA - lengthB;
    for (int i = 1; i <= steps; i++) {
        tempA = tempA.next;
    }
}
else {
    int steps = lengthB - lengthA;
    for (int i = 1; i <= steps; i++) {
        tempB = tempB.next;
    }
}
//jab tak tempA aur tempB equal na ho jaye tab tak increase krte jao 
while (tempA != tempB) {
    tempA = tempA.next;
    tempB = tempB.next;
}
//jab dono equal ho jaye tab koi bhi ek return kr do.
return tempA;
}
