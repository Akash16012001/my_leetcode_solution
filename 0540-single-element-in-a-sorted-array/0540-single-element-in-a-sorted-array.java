class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st = 0, en = nums.length - 1;
        if(nums.length == 1){
            return nums[0];
        }
        while(st <= en){
            int mid = st + (en - st) / 2;

            if(mid == 0 && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if(mid == nums.length - 1 && nums[mid] != nums[mid - 1]){
                return nums[mid];
            }
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            if(mid % 2 == 0){
                if(nums[mid - 1] == nums[mid]){
                    en = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
            else{
                if(nums[mid - 1] == nums[mid]){
                    st = mid + 1;
                }
                else{
                    en = mid - 1;
                }
            }
        }
        return -1;
    }
}