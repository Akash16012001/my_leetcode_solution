class Solution:
    def trap(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        maxLeft = height[0]
        maxRight = height[-1]
        water = 0
        while left < right:
            if maxLeft < maxRight:
                left += 1
                if maxLeft < height[left]:
                    maxLeft = height[left]
                else:
                    water += maxLeft - height[left]
            else:
                right -= 1
                if maxRight < height[right]:
                    maxRight = height[right]
                else:
                    water += maxRight - height[right]
        return water