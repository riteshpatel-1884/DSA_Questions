import java.util.Stack;

public class StackQuestion {
  public static void main(String[] args) {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> temp = new Stack<>();

    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    st.push(8);


    int n = 3;  //position 
    int no = 0;  //element to be inserted at pos 3

    while(st.size()>n){
      temp.push(st.pop());
    }
    st.push(no);

    while(temp.size()>0){
      st.push(temp.pop());
    }

    System.out.println(st);
  }
}
