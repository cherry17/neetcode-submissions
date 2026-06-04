class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int n : nums) {
            hashSet.add(n);
        }
        int longestLength = 0;
        for(int i=0; i < nums.length; i++) {
            if(!hashSet.contains(nums[i] - 1)){
                int currLongestLength = 1;
                int currentNum = nums[i] + 1;
                while(hashSet.contains(currentNum)){
                    currLongestLength++;
                    currentNum++;
                }
                longestLength = Math.max(longestLength, currLongestLength);
            }
        }
        return longestLength;
    }
}
