import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);  
                        //It will return a single list like [-1, 0, 1] therefore used List<Integer> not  List<List<Integer>>
                        Collections.sort(triplet); // Sort to handle duplicates ans like: [[-1,0,1],[-1,2,-1],[0,1,-1]] 
// It will give output as: [[-1, 0, 1], [-1, -1, 2], [-1, 0, 1]]
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
// Only add triplet to result if it is not already in there in result. Firstly [-1, 0, 1] will be added then [-1, -1, 2] and 
// since [-1, 0, 1] (duplicate) is already added there it will not be added again so this if condition is used.
                    }
                }
            }
        }

        return result;
    }
}

// List<List<Integer>> result = new ArrayList<>(); This is a list of lists. 
// Each element of result is itself a list of integers. 
// Ex: result = [
//                 [-1, -1, 2],
//                 [-1,  0, 1]
//              ];

// ArrayList<Integer> result = new ArrayList<>();
// This is a single list of integers.
// Ex: result = [-1, 0, 1, 2, -1, -4];
// TC = O(n³)



// Two Pointers

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

    if (nums.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(nums);     //nums = [-4,-1,-1,0,1,2]
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < nums.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) 
        {
          // Add to the set, and move to find other triplets
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
        } 
        else if (sum < 0)   // It  means sum is too small, we need a larger number
          left++;    
        else   // It means sum is too large, we need a smaller number
          right--;
      }
    }
    return new ArrayList<>(result);
  }
}


// https://youtu.be/cRBSOz49fQk?si=l0ZEPgTzAbPe8i4v
// Sorting takes O(n log n) time 
// For loop runs n - 2 times
// The while loop runs at most O(n) times for each element nums[i]. This is because in the worst case, 
// the left and right pointers can each move from one end of the array to the other.
// TC: O(n log n) + O(n-2)*O(n) = O(n²)
