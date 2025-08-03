class Solution {
    public int distinctAverages(int[] nums) {
        int count=0;
        List<Integer> avg = new ArrayList<>();
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(!avg.contains(sum)){
                count++;
                avg.add(sum);
            }
            i++;
            j--;
        }
        return count;
    }
}