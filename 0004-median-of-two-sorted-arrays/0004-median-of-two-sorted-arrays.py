class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        first = 0
        second = 0
        merge = []
        while first < len(nums1) and second < len(nums2):
            if nums1[first] < nums2[second]:
                merge.append(nums1[first])
                first += 1
            else:
                merge.append(nums2[second])
                second += 1
        while first < len(nums1):
            merge.append(nums1[first])
            first += 1
        while second < len(nums2):
            merge.append(nums2[second])
            second += 1
        if len(merge) % 2 == 0:
            mid = len(merge) // 2
            median = (merge[mid - 1] + merge[mid]) / 2
        else:
            median = float(merge[len(merge) // 2])
        return median