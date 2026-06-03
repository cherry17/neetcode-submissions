class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int productFromLeft[] = new int[n];
        int productFromRight[] = new int[n];
        productFromLeft[0] = nums[0];
        productFromRight[n-1] = nums[n-1];
        for(int i=1; i < n; i++) { 
           productFromLeft[i] = productFromLeft[i-1] * nums[i];
        }
        for(int i=n-2; i >=0; i--) {
            productFromRight[i] = productFromRight[i+1] * nums[i];
        }
        res[0] = productFromRight[1];
        res[n-1] = productFromLeft[n-2];
        for(int i=1; i < n-1; i++) {
            res[i] = productFromLeft[i-1] * productFromRight[i+1];
        }
        return res;
    }
}  
