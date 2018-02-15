class Solution:
    def dominantIndex(self, nums):
        big = 0
        twBig =0
        for n in nums:
            if n > big:
                twBig = big
                big = n
            elif n > twBig:
                twBig = n
        if twBig * 2 <= big:
            return nums.index(big)
        else:
            return -1

        """
        :type nums: List[int]
        :rtype: int
        """
        