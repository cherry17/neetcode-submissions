class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0, end = s.length() - 1;
        while(start < end) {
            while(start < end && !isAlphaNum(s.charAt(start))){
                start++;
            }
            while(end >=0 && !isAlphaNum(s.charAt(end))){
                end--;
            }
            if(start < end && end >0 && s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public boolean isAlphaNum(Character ch) {
        return (ch >= 'a' && ch <= 'z') 
                || (ch >= 'A' && ch <= 'Z')
                || (ch >= '0' && ch <= '9');
    }
}
