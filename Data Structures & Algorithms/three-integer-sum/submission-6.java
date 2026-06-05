class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0; i < n; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i >0 && nums[i] == nums[i-1]){
                continue;
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
                    if(start < end && nums[start] == nums[start-1]){
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if(nums[i] + nums[start] + nums[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}
