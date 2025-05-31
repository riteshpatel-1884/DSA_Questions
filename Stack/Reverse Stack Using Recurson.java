import java.util.Stack;

public class StackQuestion {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    st.push(8);
    displayReverse(st);
  }
  public static void displayReverse(Stack<Integer> st) {
    if (st.size() == 0) {
      return;
    }
    int x = st.pop();
    System.out.print(x + " ");
    displayReverse(st);
    st.push(x);
  }
}

// st.push(x): It restores the original stack after printing it in reverse.
// When you pop each element to print in reverse,you're emptying the stack. If you don't push it back, the original stack will be lost.
// By doing st.push(x) after the recursive call,you're re- adding each element back into the stack in the original order
// Your code will still print the elements in reverse order even if you remove st.push(x)

