class Solution {
    public int getWinner(int[] arr, int k) {
        if(k == 1){
            return Math.max(arr[0], arr[1]);
        }
        if(k >= arr.length){
            return Arrays.stream(arr).max().getAsInt();
        }

        int current_winner = arr[0];
        int current_wins = 0;

        for(int i = 1; i < arr.length; i++){
            if(current_winner > arr[i]){
                current_wins++;
            }
            else{
                current_winner = arr[i];
                current_wins = 1;
            }
            if(current_wins == k){
                return current_winner;
            }
        }
        return current_winner;
    }
}