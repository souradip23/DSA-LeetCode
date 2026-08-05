class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            ans^=i;
            ans^=nums[i];
        }
        return ans;
    }
}