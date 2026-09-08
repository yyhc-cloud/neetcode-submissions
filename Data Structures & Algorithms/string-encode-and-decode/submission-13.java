class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
        int i = 0;

        while (i < str.length()) {
            // Find the '#' that marks the end of the length number
            int slash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, slash));

            // Slice out the exact characters for this word
            int start = slash + 1;
            int end = start + len;
            result.add(str.substring(start, end));

            // Jump pointer directly to the start of the next chunk
            i = end;
        }

        return result;
    }
}
