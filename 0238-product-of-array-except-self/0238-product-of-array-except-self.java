class Solution {
    public int[] productExceptSelf(int[] nums) {
       int left=1;
       int right=1;
       int[] res=new int[nums.length];
       Arrays.fill(res,1);
       for(int i=0;i<nums.length;i++){
          res[i]*=left;
        left*=nums[i];
        res[nums.length-i-1]*=right;
        right*=nums[nums.length-i-1];
        
       } 
       return res;
    }
}