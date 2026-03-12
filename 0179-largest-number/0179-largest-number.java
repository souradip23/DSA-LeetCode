class Solution {
    public String largestNumber(int[] nums) {
     int n=nums.length;
     String[] newarr=new String[n]; 
     for(int i=0;i<n;i++){
        newarr[i]=String.valueOf(nums[i]);
     }  
     // Sort lexographically decending ->  custom sorting 
     Arrays.sort(newarr,(a,b)->(b+a).compareTo(a+b));
     // if my first or largest number character is 0
     if(newarr[0].charAt(0)=='0'){
        return "0";
     } 
     StringBuilder sb=new StringBuilder();
     for(String s: newarr){
        sb.append(s);
     }
    return sb.toString();
    }
}