class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        for n in range(1, len(nums)):
            res[n] = res[n-1] * nums[n-1]

        postfix = 1

        for n in range(len(nums)-1, -1, -1):
            res[n] = res[n] * postfix
            postfix = postfix * nums[n]

        return res


#1，2，4，6
#1，1，2，8
#    48 ，24 ，12，8