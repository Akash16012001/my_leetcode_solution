class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }
}