class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length+1];

        for(int n : map.keySet()){
            int fre = map.get(n);

            if(bucket[fre] == null){
                bucket[fre] = new ArrayList();
            }

            bucket[fre].add(n);
        }

        int index = 0;

        for(int i = bucket.length - 1; i>0; i--){
            if(bucket[i] != null){

                for(int n : bucket[i]){
                    if(index == k){
                        return result;
                    }

                    result[index++] = n;

                }
            }
        }

        return result;
    }
}