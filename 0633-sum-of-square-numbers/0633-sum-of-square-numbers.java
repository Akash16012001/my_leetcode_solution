class Solution {
    public boolean judgeSquareSum(int c) {
        long first = 0;
        long last = (long)Math.sqrt(c);
        boolean ans = false;
        // if(c == 0){
        //     return true;
        // }
        while(first <= last){
            long calc = (first * first) + (last * last);
            if(calc == c){
                ans = true;
                return ans;
            } else if(calc < c){
                first++;
            } else {
                last--;
            }
        }
        return ans;
    }
}