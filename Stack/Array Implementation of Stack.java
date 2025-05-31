
public class StackQuestion {
  int[] array = new int[7];
  int index = 0; // index of Stack

  boolean isFull() {
    return index == array.length;
  }

  boolean isEmpty(){
    if(index == 0)
    return true;
    else
    return false;
  }

  void push(int x) {
    if (isFull()) {
      System.out.println("Stack is Full");
      return;
    } else {
      array[index] = x;
      index++;
    }
  }

  int pop(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    }
    else
    {
      int x = array[index - 1];
      array[index-1] = 0;
      index--;
      return x;
    }
  }
    int peek(){
      if(isEmpty()){
        System.out.println("Stack is Empty");
        return -1;
      }
      else{
        int x = array[index - 1];
        return x;
      }
    }

    void display(){
      if(isEmpty()){
        System.out.println("Stack is Empty");
      }
      else{
        for (int i = 0; i <= index - 1; i++) {
          System.out.print(array[i] + " ");
        }
        System.out.println();
      }
      }
   
  public static void main(String[] args) {
    StackQuestion st = new StackQuestion();
    st.display();   // Stack is Empty
    System.out.println(st.isEmpty());  // true since there is no element pushed into stack
    st.push(1);
    st.push(2);
    System.out.println(st.isEmpty()); // false
    st.push(3);
    st.push(4);
    st.display();  // 1 2 3 4
    st.pop();  
    st.display();  // 1 2 3
    st.push(5);
    st.push(6);
    st.push(7);
    st.display();  //// 1 2 3 5 6 7    
    System.out.println("Peeked element is: "+ st.peek());  // Peeked element is: 7
    System.out.println(st.isFull()); //Size is 7 so false
    st.push(5);
    System.out.println(st.isFull());  //Size becomes 8 therefore true


  }
}
