import java.util.Stack;

public class StackQuestion {
  public static void main(String[] args) {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> temp = new Stack<>();
    Stack <Integer> ans = new Stack<>();

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    while(st.size()>0){
      int x = st.pop();
      temp.push(x);    // temp.push(st.pop());
    }

    while(temp.size()>0){
      int x = temp.pop();
      ans.push(x);
    }

    System.out.println(ans);
  }
}
