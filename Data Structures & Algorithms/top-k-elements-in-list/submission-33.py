from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}  # number : frequency

        for num in nums:
            count[num] = count.get(num, 0) + 1

        bucket = [[] for _ in range(len(nums) + 1)]

        for key, fre in count.items():
            bucket[fre].append(key)

        res = []

        for i in range(len(bucket)-1, 0, -1):
            for item in bucket[i]:
                res.append(item)

                if len(res) == k:
                    return res

        return res
        