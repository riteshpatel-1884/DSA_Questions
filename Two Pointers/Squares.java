

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
