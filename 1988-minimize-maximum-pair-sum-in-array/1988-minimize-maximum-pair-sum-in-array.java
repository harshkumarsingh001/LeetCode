class Solution {
    public int minPairSum(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);

        int ans =-1;
        for(int i=0;i<n/2;i++){
           ans=Math.max(ans,nums[i]+nums[n-1-i]);
        }
        return ans;
    }
}