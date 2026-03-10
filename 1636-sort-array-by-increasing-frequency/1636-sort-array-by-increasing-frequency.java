class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Integer[] temp=new Integer[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp,(a,b)->{
            int fa=map.get(a);
            int fb=map.get(b);
            if(fa!=fb){
                return fa-fb;
            }else{
                return b-a;
            }
        });
         for(int i=0;i<n;i++){
            nums[i]=temp[i];
         }
         return nums;
    }
}