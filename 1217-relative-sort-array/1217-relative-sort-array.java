class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[arr1.length];
        int index = 0;

        for(int ele : arr1){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for(int i = 0; i < arr2.length; i++){
            int count = map.get(arr2[i]);
            for (int j = 0; j < count; j++){
                res[index++] = arr2[i];
            }
            map.remove(arr2[i]);
        }

        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            for (int j = 0; j < count; j++) {
                remaining.add(key);
            }
        }

        // Sort the remaining elements
        Collections.sort(remaining);

        // Add sorted remaining elements to the result array
        for (int ele : remaining) {
            res[index++] = ele;
        }

        return res;
    }
}