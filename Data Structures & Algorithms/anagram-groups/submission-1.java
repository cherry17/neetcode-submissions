class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int evaluated[] = new int[strs.length];
        List<List<String>> res = new LinkedList<>();
        Arrays.fill(evaluated, 0);
        for(int i=0; i < strs.length; i++) {
            if(evaluated[i] == 1){
                continue;
            }
            List<String> innerRes = new LinkedList<>();
            innerRes.add(strs[i]);
            for(int j=i+1; j < strs.length; j++) {
                if(isAnagram(strs[i], strs[j])){
                    innerRes.add(strs[j]);
                    evaluated[j] = 1;
                }
            }
            evaluated[i] = 1;
            res.add(innerRes);
        }
        return res;
    }

    public boolean isAnagram(String s1, String s2) {
        int hash[] = new int[26];
        Arrays.fill(hash, 0);
        for(int i=0; i < s1.length(); i++) {
            hash[s1.charAt(i) - 'a'] +=1;
        }
        for(int i=0; i < s2.length(); i++) {
            hash[s2.charAt(i) - 'a'] -=1;
        }
        for(int i=0; i < 26; i++) {
            if(hash[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
