from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = Counter(nums)  # e.g., {1: 3, 2: 2, 3: 1}
        
        # Sort the unique keys by their frequency in reverse order
        sorted_keys = sorted(count.keys(), key=lambda x: count[x], reverse=True)
        
        # Take the first k elements
        return sorted_keys[:k]