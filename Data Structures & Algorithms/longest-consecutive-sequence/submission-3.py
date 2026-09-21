class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:    

        if not nums:
            return 0

        nums.sort()
        checking = nums

        current = 1
        result = 1
        test = checking[0]

        for i in range(1, len(checking)):

            if checking[i] == test:
                continue

            elif checking[i] - test == 1:
                current += 1
                test = checking[i]

            else:
                current = 1
                test = checking[i]

            result = max(current, result)

        return result
