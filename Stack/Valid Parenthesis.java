class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' )
             st.push(s.charAt(i));
            else {
                if(st.size() == 0)  //Because if the stack is empty but we see a closing bracket, it means there is 
                 return false;     // no matching opening bracket for it.     
                if(s.charAt(i) == ')' && st.peek() == '(' || s.charAt(i) == ']' && st.peek() == '[' || s.charAt(i) == '}' && st.peek() == '{') 
                 st.pop();
                 else 
                 return false;
            }
        }
        return st.size() ==0;
    }
}
