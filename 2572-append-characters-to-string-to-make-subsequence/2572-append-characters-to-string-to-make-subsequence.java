class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0, tIndex = 0;
        for(int i = 0; sIndex < s.length() && tIndex < t.length(); i++){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                tIndex++;
            } else {
                sIndex++;
            }
        }
        return t.length() - tIndex;
    }
}