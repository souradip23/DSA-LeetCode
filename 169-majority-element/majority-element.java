class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(map.get(nums[i])>(n/2)){
            return nums[i];
        }
       }
       return -1;
    }
}