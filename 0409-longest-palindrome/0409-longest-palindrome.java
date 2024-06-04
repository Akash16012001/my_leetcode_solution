class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
            } else {
                set.remove(c);
                count += 2;
            }
        }

        if(set.size() > 0){
            count += 1;
        }

        return count;
    }
}