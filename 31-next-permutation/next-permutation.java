class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(nums[i] > nums[pivot]){
                    swap(nums,i,pivot);
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
    public void reverse(int []nums,int left,int right){
        while(left<right){
         swap(nums,left++,right--);
        }
    }
    public void swap(int []nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}