class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rowStrengths = new int[mat.length][2];
        int[] res = new int[k];
        for(int i = 0; i < mat.length; i++){
            int strength = 0;
            for(int j = 0; j < mat[0].length; j++){
                strength += mat[i][j];
            }
            rowStrengths[i][0] = strength;
            rowStrengths[i][1] = i;
        }
        Arrays.sort(rowStrengths, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i = 0; i < k; i++){
            res[i] = rowStrengths[i][1];
        }
        return res;
    }
}