class Solution {
    public int longestSubarray(int[] nums) {
        int k=0, left=0, right=0,ans=0;
        for(right=0; right<nums.length; right++){
            if(nums[right]==0){
                k++;
            }
            while(k>1){
                if(nums[left]==0){
                    k--;
                }
                left++;
            }
            ans=Math.max(ans,right-left+1-k);
        }
        return (ans==nums.length)?ans-1:ans;
    }
}