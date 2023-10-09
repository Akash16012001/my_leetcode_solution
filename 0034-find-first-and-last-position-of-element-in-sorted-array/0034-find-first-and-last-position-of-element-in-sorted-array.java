class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int j = nums.length - 1;
        if(nums.length == 0){
            return new int[]{-1,-1};
        }
        int left = leftElement(nums,target);
        int right = rightElement(nums,target);
        return new int[]{left,right};
    }
    public int leftElement(int[] nums, int target){
        int index = -1;
        int first = 0, last = nums.length - 1;
        while(first <= last){
            int mid = (first + last)/2;
            if(nums[mid] == target){
                index = mid;
                last = mid - 1;
            }
            if(nums[mid] > target){
                last = mid - 1;
            }
            if(nums[mid] < target){
                first = mid + 1;
            }
        }
        return index;
    }
    public int rightElement(int[] nums, int target){
        int index = -1;
        int first = 0, last = nums.length - 1;
        while(first <= last){
            int mid = (first + last)/2;
            if(nums[mid] == target){
                index = mid;
                first = mid + 1;
            }
            if(nums[mid] > target){
                last = mid - 1;
            }
            if(nums[mid] < target){
                first = mid + 1;
            }
        }
        return index;
    }
}