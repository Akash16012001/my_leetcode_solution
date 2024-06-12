class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        int index = 0;

        for(int num : nums){
            if(num == 0){
                zeroCount++;
            } else if(num == 1){
                oneCount++;
            } else {
                twoCount++;
            }
        }

        for(int i = 0; i < zeroCount; i++){
            nums[index++] = 0;
        }

        for(int i = 0; i < oneCount; i++){
            nums[index++] = 1;
        }

        for(int i = 0; i < twoCount; i++){
            nums[index++] = 2;
        }
    }
}