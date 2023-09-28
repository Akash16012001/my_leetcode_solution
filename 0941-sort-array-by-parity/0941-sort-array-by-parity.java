class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sort = new int[nums.length];
        int first = 0;
        int last = sort.length - 1;
        for(int num : nums){
            if(num % 2 == 0){
                sort[first++] = num;
            }
            else{
                sort[last--] = num;
            }
        }
        return sort;
    }
}