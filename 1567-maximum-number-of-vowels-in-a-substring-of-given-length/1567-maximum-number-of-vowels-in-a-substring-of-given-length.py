class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        windowVowels = 0;
        maxVowels = 0
        for i in range(k):
            if s[i] in vowels:
                windowVowels += 1
        
        maxVowels = windowVowels

        for i in range(k, len(s)):
            if s[i - k] in vowels:
                windowVowels -= 1
            if s[i] in vowels:
                windowVowels += 1
            maxVowels = max(maxVowels, windowVowels)
        return maxVowels