
public class arrange {
  // Move even on left side and odd on right side
  // Explanation: Same as arrange_Zero_One problem. Here even numbers ko 0 assume
  // kr lo aur odd numbers ko 1 assume kr lo.
  public static void main(String[] args) {
    int[] arr = { 1, 23, 45, 65, 78, 45, 23, 5, 634, 56, 3 };
    int n = arr.length;
    int left = 0, right = n - 1; // one pointer will move from arr[left] and ther pointer will move from arr[right]
    arrange_array(arr, left, right);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void arrange_array(int[] arr, int left, int right) {
    while (left < right) {
      if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
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
