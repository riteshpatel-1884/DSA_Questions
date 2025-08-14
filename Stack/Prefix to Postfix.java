// Prefix to Postfix
import java.util.Stack;
public class practice { 
  public static void main(String[] args) {
    Stack<String> val = new Stack<>();
    String str = "-9/*+5346";

    for (int i = str.length()-1; i >=0; i--) {
      char ch = str.charAt(i);
      int ascii = (int) ch;
      if (ascii >= 48 && ascii <= 57) {
        val.push(ch + "");
      } else {
        String v1 = val.pop();
        String v2 = val.pop();
        String temp = v1 + v2 + ch;
        val.push(temp);
      }
    }
    System.out.println("Postfix: " + val.peek());
  }
}
