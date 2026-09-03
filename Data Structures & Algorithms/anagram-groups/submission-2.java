class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap<>();

        for(int i = 0; i<strs.length; i++){
            char[] test = strs[i].toCharArray();
            Arrays.sort(test);
            String s = new String(test);

            map.computeIfAbsent(s, k-> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());        
    }
}
