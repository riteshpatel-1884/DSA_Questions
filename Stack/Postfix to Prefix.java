// Postfix to Prefix
import java.util.Stack;

public class practice {
  public static void main(String[] args) {
    Stack<String> val = new Stack<>();
    String str = "953+4*6/-";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57) {
        val.push(ch + "");
      } else {
        String v2 = val.pop();
        String v1 = val.pop();
        String temp = ch + v1 + v2;
        val.push(temp);
      }
    }
    System.out.println("Prefix: " + val.peek());
  }
}
