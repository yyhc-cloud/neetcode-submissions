class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int num : map.keySet()) {
            int fre = map.get(num);

            if(bucket[fre] == null){
                bucket[fre] = new ArrayList<>();
            }

            bucket[fre].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for(int i = bucket.length - 1; i>0; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    if(index == k){
                        return result;
                    }

                    result[index++] = num;
                }
            }
        }

        return result;
    }
}