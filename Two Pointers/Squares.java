// Given an array sorted in non- decreasing order. Return an array of the squares of numbers which must also be in the non decreasing order
// arr= [-10,-9,-6,1,2,3,4,5]
// ans= [1,4,9,15,25,36,81,100]
//Explanation: Since there will also be a negative number, so its square may be greator than the last number ie 5. Start one pointer from left and one from right. Compare the absolute value(absolute will remove -ve sign) if left is bigger store its square in ans and left pointer ko increase kr do but right ko mat kro kyuki absolute value of second element of left pointer 5 se bada ho shakta hai jo ki hai since 9 >  5  and increment left pointer only,so write 81 in ans. again 6  > 5, so write 36 in ans and  increment left pointer only. Now 1 < 5, so store 25 in the ans and decrement the right pointer only. 1 < 4, 1<3,1<2 so store 16,9 and 4 in ans and decrement right pointer. 

public class Squares {
  public static void main(String[] args) {
    int[] arr = { -10, -9, -6, 1, 2, 3, 4, 5 };
    int n = arr.length;
    int left = 0, right = n - 1;

    int[] ans = arrange(arr, left, right);

    for (int i = n-1; i >=0; i--) {
      System.out.print(ans[i] + " ");
    }
    // reversing the array [100,81,36,25,16,9,4,1] into [1 4 9 16 25 36 81 100]
  }

  public static int[] arrange(int[] arr, int left, int right) {
    int n = arr.length;
    int[] ans = new int[n];
    int k = 0; // used as index of the ans[] array 
    while (left <= right) {
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        ans[k++] = arr[left] * arr[left]; 
        left++;
      } else {
        ans[k++] = arr[right] * arr[right];
        right--;
      }
    }
    return ans;
  }
}
