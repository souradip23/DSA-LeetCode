class Solution {
    public boolean checkOnesSegment(String s) {
    //    HashSet<Character> set=new HashSet<>();
    //    boolean  flag=false;
    //    for( char ch:s.toCharArray()){
    //     set.add(ch);
    //     if(ch=='0'){
    //             flag=true;
    //     }
    //     if(ch=='1' && flag){
    //         return false;
    //     }
    //    } 
    //    return true;
    
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                flag=true;
            }
            if(s.charAt(i)=='1' && flag){
                return false;
            }
        }
        return true;
    }
}