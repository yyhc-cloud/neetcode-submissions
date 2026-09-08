class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new ArrayList[nums.length+1];

        for(int num : map.keySet()){
            int fre = map.get(num);

            if(list[fre] == null){
                list[fre] = new ArrayList();
            }

            list[fre].add(num);
        }

        int index = 0;
        int[] result = new int[k];

        for(int i = list.length - 1; i>0; i--){
            if(list[i] != null){
                for(int num : list[i]){
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