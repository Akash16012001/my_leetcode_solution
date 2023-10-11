class Solution {
    private int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ind = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                ind = Math.max(ind, mid);
                start = mid + 1;
            }
        }
        return ind + 1;
    }
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];

        for(int i = 0; i < flowers.length; i++){
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] res = new int[people.length];

        for(int i = 0; i < people.length; i++){
            int t = people[i];
            int started = binarySearch(start, t);
            int ended = binarySearch(end, t - 1);
            res[i] = started - ended;
        }
        return res;
    }
}
// flowers = [[1,6],[3,7],[9,12],[4,13]], poeple = [2,3,7,11]
// start = [1, 3, 4, 9] t = 7   ind = 2
// end = [6, 7, 12, 13] t = 7   ind = 