class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        for i in range(1, len(nums)):
            res[i] = res[i-1] * nums[i-1]

        postFix = 1

        for i in range(len(nums) - 1, -1, -1):
            res[i] = res[i] * postFix
            postFix = postFix * nums[i]

        return res

# 1, 2, 4, 6
# 1, 1, 2, 8
# 48, 24, 12, 8