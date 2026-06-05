class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i < n; i++) {
            if(nums[i] > 0) {
                break;
            }
            int start = i+1;
            int end = n-1;
            while(start < end) {
                if(nums[i] + nums[start] + nums[end] == 0) {
                    List<Integer> innerRes = new LinkedList<>();
                    innerRes.add(nums[i]);
                    innerRes.add(nums[start]);
                    innerRes.add(nums[end]);
                    res.add(innerRes);
                    start++;
                    end--;
                } else if(nums[i] + nums[start] + nums[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return new LinkedList<>(res);
    }
}
