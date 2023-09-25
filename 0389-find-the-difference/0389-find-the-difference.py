class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        num = 0
        res = ""
        for ch in t:
            num += ord(ch)
        for ch in s:
            num -= ord(ch)
        res = res + chr(num)
        return str(res)