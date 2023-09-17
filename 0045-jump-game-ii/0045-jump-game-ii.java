class Solution {
    public int jump(int[] nums) {
       int jump = 0, currEnd = 0, currFarthest = 0;
       for(int i = 0; i < nums.length - 1; i++){
           currFarthest = Math.max(currFarthest, i + nums[i]);
           if(i == currEnd){
               currEnd = currFarthest;
               jump++;
           }
       }
       return jump;
    }
}
//  [2,3,1,1,4]