class Solution {
    public int countCommas(int n) {
        String s=String.valueOf(n);
        // System.out.println(s);
        if(s.length() <= 3)return 0; //edge case 
        int count=0;
        for(int i=1;i<=n;i++){
            if(i>=1000){
                count++;
            }
        }
        return count;
    }
}