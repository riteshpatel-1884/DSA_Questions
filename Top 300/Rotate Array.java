class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        k = k % n;
        int c = 0;
        int[] array = new int[n];
        for(int i = n-k; i<n; i++)
            array[c++] = nums[i];

        for(int j = 0; j<n-k; j++)
            array[c++] = nums[j];

        for(int i = 0; i<n; i++)
            nums[i] = array[i];

        for(int i = 0; i<n; i++)
            System.out.println(nums[i]);
    }
}
// Time Complexity = O(n)
// Space Complexity = O(n)

// Two Pointer
class Solution {
    public void rotate(int[] nums, int k){
         int n = nums.length;
         k = k % n;
         recursion(nums, 0, n-1); //It will rotate the whole string
         recursion(nums, 0, k-1); 
         recursion(nums, k, n-1);

        for(int i = 0 ; i<n; i++)
        {
            System.out.println(nums[i]);
        }
    }

    public int[] recursion(int[] nums, int i, int j)
    {

        while(i<=j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
}
// Time Complexity = O(n)
// Space Complexity = O(1)
// This is the most efficient way to rotate an array in terms of both time and space


