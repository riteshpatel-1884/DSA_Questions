
public class arrange_Zero_One {
  // Move 0 on left side and 1 on right side
  public static void main(String[] args) {
    int[] arr = { 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0 };
    int n = arr.length;
    int left = 0, right = n - 1; // one pointer will move from arr[left] and other pointer will move from arr[right]
    arrange_array(arr, left, right);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void arrange_array(int[] arr, int left, int right) {
    while (left < right) {
      if (arr[left] == 1 && arr[right] == 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
      }
      if (arr[left] % 2 == 0)
        left++;
      if (arr[right] % 2 != 0)
        right--;
    }
  }
}
