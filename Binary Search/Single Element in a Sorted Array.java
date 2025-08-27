class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1)
         return nums[0];
        if(nums[0]!= nums[1])
         return nums[0];
        if(nums[n-1]!= nums[n-2])
         return nums[n-1];
        
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1])
             return nums[mid];
            int first_occurance = mid;
            int second_occurance = mid;
            if(nums[mid-1] == nums[mid])
             first_occurance = mid - 1;
            else
             second_occurance = mid+1;
            int left_element_Count = first_occurance - low;
            int right_element_Count = high - second_occurance;
            if(left_element_Count %2 ==0)
             low = second_occurance + 1;
            else 
             high = first_occurance - 1;
        }
        return -1;
    }
}
