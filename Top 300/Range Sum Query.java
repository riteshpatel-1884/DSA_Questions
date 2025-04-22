class NumArray {
int[] prefix; // so that it can also be accessed in sumRange function
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length;i++)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
          // If the range starts from index 0, return prefix[right] directly becoz it means prefix[right] - prefix[-1];
        if(left == 0)
         return prefix[right];

        return prefix[right] - prefix[left-1];
    }
}

