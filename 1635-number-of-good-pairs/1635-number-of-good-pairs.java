class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] res = new int[102];
        for(int num : nums){
            res[num]++;
        }
        int totalCount = 0;
        for(int i : res){
            totalCount += ((i) * (i - 1)) / 2;
        }
        return totalCount;
    }
}