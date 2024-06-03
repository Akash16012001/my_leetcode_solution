class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        s_length, t_length = len(s), len(t)
        s_index, t_index = 0, 0

        while s_index < s_length and t_index < t_length:
            if s[s_index] == t[t_index]:
                t_index += 1
            s_index += 1
        
        return t_length - t_index
