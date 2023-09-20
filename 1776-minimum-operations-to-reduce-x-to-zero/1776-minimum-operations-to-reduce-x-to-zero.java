class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int num : nums){
            target += num;
        }
        if(target == 0){
            return nums.length;
        }
        int maxLen = 0, currSum = 0, left = 0;
        for(int right = 0; right < nums.length; right++){
            currSum += nums[right];
            while(left <= right && currSum > target){
                currSum -= nums[left];
                left++;
            }
            if(currSum == target){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen != 0 ? nums.length - maxLen : -1;
    }
}