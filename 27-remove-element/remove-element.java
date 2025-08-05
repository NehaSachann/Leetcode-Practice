class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]==val){
                nums[i]=-1;
                count++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]<nums[j]){
                    int temps=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temps;
                }
            }
        }
        return n-count;
    }
}