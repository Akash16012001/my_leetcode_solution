class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numMap = {}
        # n = len(nums)

        for i, j in enumerate(nums):
            component = target - j
            if j in numMap:
                return [numMap[j], i]
            numMap[component] = i

#   2,7,11,15