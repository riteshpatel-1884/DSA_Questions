class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int res=0;
        for (int num : nums) {
            if (num < pivot) {
                result[res++] = num;
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                result[res++] = num;
            }
        }
        for (int num : nums) {
            if (num > pivot) {
                result[res++] = num;
            }
        }
        return result;
    }
}
// Cons:
// TC & SC = O(n)
// 3 full passes(loop) over the array (still O(n), but not as tight as 1-pass).
// Not as clever or optimized — uses simplicity over cleverness.



//Two Pointers  TC & SC = O(n)

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left  = 0;
        int n = nums.length;
        int right = n-1;
        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
                result[left++] = nums[i]; 
            else if(nums[i]>pivot)
                result[right--] = nums[i];
        }

        int total_pivot = n - left - (n - 1 - right);
        // It will count the total pivot element and add it from the element less than pivot element 
        for(int i=0;i<total_pivot;i++)
        {
            result[left++] = pivot;
        }

        // Reverse the elements > pivot that were inserted from right-to-left because they are currently in reverse order
        int start = right+1;
        int end = n-1;
        while(start<end)
        {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }
        return result;
    }
}

// Pros:
// Single-pass classification of < pivot and > pivot elements.
// Only one loop through the array for distribution
// The Two-Pointer version is more efficient.

//Cons:
// The elements greater than pivot are inserted in reverse order, requiring a fix (the extra reversal step).

