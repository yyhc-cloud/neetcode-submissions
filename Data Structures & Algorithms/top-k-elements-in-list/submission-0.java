class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Distribute into buckets by frequency
        for (int num : map.keySet()) {
            int fre = map.get(num);
            if (bucket[fre] == null) {
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(num);
        }

        // 3. Gather top k frequent elements from highest frequency to lowest
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}