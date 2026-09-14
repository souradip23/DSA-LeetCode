class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int num: nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // int ele=-1;
        // int freq=0;
        // for(int i=0;i<nums.length;i++){
        //     if(map.get(nums[i]) > freq || (map.get(nums[i]) == freq) && ele > freq){
        //         freq=map.get(nums[i]);
        //         ele=nums[i];
        //     }
        // }
        // return ele;

        int candidate=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate =nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}