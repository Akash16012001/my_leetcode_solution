class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        temp = x
        num = 0
        while x != 0:
            r = x % 10
            num = num * 10 + r
            x //= 10
        if temp == num:
            return True
        return False