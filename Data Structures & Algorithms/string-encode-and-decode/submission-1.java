class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < strs.size(); i++) {
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new LinkedList<>();
        for(int i=0; i < str.length();) {
            int start = i;
            while(str.charAt(i) != '#') {
                i++;
            }
            int len = Integer.valueOf(str.substring(start, i));
            res.add(str.substring(i+1, i+1+len));
            i = i+1+len;
        }
        return res;
    }
}
