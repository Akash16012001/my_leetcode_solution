class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2){
            return nums[0];
        }
        int[] skipLastHouse = new int[nums.length - 1];
        int[] skipFirstHouse = new int[nums.length - 1];

        for(int i = 0; i < nums.length - 1; i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i + 1];
        }
        int firstSolution = helper(skipLastHouse);
        int lastSolution = helper(skipFirstHouse);

        return Math.max(firstSolution, lastSolution);
    }
    private int helper(int[] arr){
        if(arr.length < 2){
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++){
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }
        return dp[arr.length - 1];
    }
}