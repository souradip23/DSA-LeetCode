class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        return helper(nums,0,n-1)>=0;
    }
    private int helper(int [] nums,int i,int j){
        if(i==j)return nums[i];
        return Math.max(
           nums[i]-helper(nums,i+1,j),
            nums[j]-helper(nums,i,j-1)
        );
    }
}