class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero_count = nums.count(0)
        one_count = nums.count(1)
        two_count = nums.count(2)
        idx = 0

        for i in range(zero_count):
            nums[idx] = 0
            idx += 1

        for i in range(one_count):
            nums[idx] = 1
            idx += 1

        for i in range(two_count):
            nums[idx] = 2
            idx += 1