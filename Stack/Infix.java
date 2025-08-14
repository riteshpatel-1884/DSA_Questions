//9-5+3*4/6 = 6

import java.util.Stack;

public class practice {
  public static void main(String[] args) {
    String str = "9-5+3*4/6";
    Stack<Integer> st = new Stack<>();
    Stack<Character> op = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int ascii = (int) ch;

      if (ascii >= 48 && ascii <= 57) {
        st.push(ascii - 48);
      } else if (op.size() == 0) {
        op.push(ch);
      } else {
        if (ch == '+' || ch == '-') {
          int v2 = st.pop();
          int v1 = st.pop();
          if (op.peek() == '+')
            st.push(v1 + v2);
          if (op.peek() == '-')
            st.push(v1 - v2);
          if (op.peek() == '*')
            st.push(v1 * v2);
          if (op.peek() == '/')
            st.push(v1 / v2);
          op.pop();
          op.push(ch);
        }
        if (ch == '*' || ch == '/') {
          if (op.peek() == '*' || op.peek() == '/') {
            int v2 = st.pop();
            int v1 = st.pop();
            if (op.peek() == '*')
              st.push(v1 * v2);
            if (op.peek() == '/')
              st.push(v1 / v2);
            op.pop();
            op.push(ch);
          } else {
            op.push(ch);
          }
        }
      }
    }
    while (st.size() > 1) {
      int v2 = st.pop();
      int v1 = st.pop();
      if (op.peek() == '+')
        st.push(v1 + v2);
      if (op.peek() == '-')
        st.push(v1 - v2);
      if (op.peek() == '*')
        st.push(v1 * v2);
      if (op.peek() == '/')
        st.push(v1 / v2);
      op.pop();
    }
    System.out.println("Result: " + st.peek());
  }
}
