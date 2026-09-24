class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:    
        if not nums:
            return 0

        nums.sort()

        checking = nums

        current = 1
        result = 1

        for i in range(1, len(checking)):
            if checking[i] - checking[i-1] == 1:
                current += 1

            elif checking[i] == checking[i-1]:
                continue

            else:
                result = max(current, result)
                current = 1

            result = max(current, result)
            
        return result
