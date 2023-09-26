class Solution {
    public String smallestSubsequence(String s) {
        Stack<Integer> st = new Stack<>();
        int[] lastIndex = new int[26];
        for(int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); i++){
            int curr = s.charAt(i) - 'a';
            if(seen[curr]) continue;
            while(!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false;
            }
            st.push(curr);
            seen[curr] = true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : st){
            sb.append((char) (i + 'a'));
        }
        return sb.toString();
    }
}