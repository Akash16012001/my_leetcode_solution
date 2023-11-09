class Solution {
    public int countHomogenous(String s) {
        long res = 0;
        int start = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] != c[start]){
                int appear = i - start;
                while(appear > 0){
                    res += appear;
                    appear--;
                }
                start = i;
            }
        }
        int appear = c.length - start;
        while(appear > 0){
            res += appear;
            appear--;
        }
        return (int)(res % (Math.pow(10, 9) + 7));
    }
}
//"abbcccaa"