class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx=0;
        for(int i=0;i<t.length();i++){
            if(idx<s.length() && s.charAt(idx)==t.charAt(i)){
                idx++;
            }
        }
        if(s.length()==idx)return true;
        else return false;
    }
}