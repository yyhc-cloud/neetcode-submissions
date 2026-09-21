class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:    

        if not nums:
            return 0

        nums.sort()
        checking = nums

        test = checking[0]
        result = 1
        current = 1

        for i in range(1, len(checking)):
            if test == checking[i]:
                continue

            elif checking[i] - test == 1:
                current += 1
                test = checking[i]

            else:
                current = 1
                test = checking[i]

            result = max(current, result)

        return result
