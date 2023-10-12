/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakElement(mountainArr);
        int ans = binarySearch(target, mountainArr, 0, peak);
        if(ans == -1){
            return binarySearch(target, mountainArr, peak + 1, mountainArr.length() - 1);
        }
        return ans;
    }

    private static int findPeakElement(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    private static int binarySearch(int target, MountainArray mountainArr, int start, int end){
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid = (start + end) / 2;
            if(mountainArr.get(mid) == target){
                return mid;
            }
            if(isAsc){
                if(mountainArr.get(mid) < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(mountainArr.get(mid) > target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

//  [0,10,20,15,6,5,2]