class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for(int i = 0; i < n; i++){
            char ch = chars[i];
            int count = 0;
            while(i < n && chars[i] == ch){
                count++;
                i++;
            }
            if(count == 1){
                chars[idx++] = ch;
            }else{
                chars[idx++] = ch;
                String str = String.valueOf(count);
                for(char dig : str.toCharArray()){
                    chars[idx++] = dig;
                }
            }
            i--;
        }
        //chars[i]
        return idx;
    }
}