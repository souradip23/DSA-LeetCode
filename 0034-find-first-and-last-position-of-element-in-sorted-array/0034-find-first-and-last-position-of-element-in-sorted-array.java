class Solution {
    public int[] searchRange(int[] nums, int target) {
       int [] res=new int[2];
       res[0]=firstPos(nums,target);
       res[1]=lastPos(nums,target);
       return res; 
    }
    static int firstPos(int[] nums,int target){
        int res=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                res=mid;
                right=mid-1;
            }
        }
        return res;
    }
    static int lastPos(int[] nums,int target){
        int res=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                res=mid;
                left=mid+1;
            }
        }
        return res;
    }
}