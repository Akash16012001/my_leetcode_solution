class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return nums[0]
        def helper(arr: List[int]) -> int:
            if len(arr) < 2:
                return arr[0]
        
            dp = [0] * len(arr)
            dp[0] = arr[0]
            dp[1] = max(arr[0], arr[1])

            for i in range(2, len(arr)):
                dp[i] = max(dp[i - 2] + arr[i], dp[i - 1])

            return dp[-1]
        skipLastHouse = [0] * (len(nums) - 1)
        skipFirstHouse = [0] * (len(nums) - 1)

        for i in range(len(nums) - 1):
            skipLastHouse[i] = nums[i]
            skipFirstHouse[i] = nums[i + 1]

        firstSolution = helper(skipLastHouse)
        lastSolution = helper(skipFirstHouse)

        return max(firstSolution, lastSolution)
    