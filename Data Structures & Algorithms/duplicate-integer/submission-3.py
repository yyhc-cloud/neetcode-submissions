class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        checking = set()

        for n in nums:
            if n in checking:
                return True
            else:
                checking.add(n)

        return False
        