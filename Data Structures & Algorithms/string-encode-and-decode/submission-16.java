class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

// 2#Hi
    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;

        while(i<str.length()){
            int delimiterIndex = str.indexOf('#', i);
            String lenStr = str.substring(i, delimiterIndex);
            int len = Integer.parseInt(lenStr);
            int start = delimiterIndex + 1;
            int end = start + len;

            result.add(str.substring(start, end));
            i = end;
            
        }

        return result;
    }
}
