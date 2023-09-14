class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int index = 0, first = 0, second = 0;
        double median = 0.0;
        int[] merg = new int[nums1.length + nums2.length];
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] < nums2[second]){
                merg[index++] = nums1[first];
                first++;
            }
            else{
                merg[index++] = nums2[second];
                second++;
            }
            i++;
        }
        while(first < nums1.length){
            merg[index++] = nums1[first++];
        }
        while(second < nums2.length){
            merg[index++] = nums2[second++];
        }
        // median = ((double)(merg[0] + merg[merg.length - 1])) / 2;
        int arrLen = nums1.length + nums2.length;
        if(arrLen % 2 == 0){
            median = ((double)(merg[arrLen/2 - 1] + merg[arrLen/2])) / 2;
            return median;
        }
        else{
            median = (double)(merg[arrLen/2]);
            return median;
        }
        
    }
}