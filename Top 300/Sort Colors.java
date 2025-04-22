class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero = 0, one= 0, two =0, k=0;
        for(int i = 0; i<n; i++)
        {
            if(nums[i] == 0)
            zero++;
            else if(nums[i] == 1)
            one++;
            else
            two++;
        }

        for(int i =0; i<zero;i++)
        {
            nums[k++] = 0;
        }

        for(int i=0; i<one;i++)
        {
            nums[k++] = 1;
        }
        for(int i = 0; i<two;i++)
        {
            nums[k++] = 2;
        }

        for(int i = 0; i<n; i++)
        {
            System.out.println(nums[i]);
        }
    }
}


// Using 3 Pointers
class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, start, mid);
                start++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, end);
                end--;
            }
        }
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
// Refer A4 Sheet for solution
