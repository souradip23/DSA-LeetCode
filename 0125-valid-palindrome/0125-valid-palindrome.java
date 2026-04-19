class Solution {
    public boolean isPalindrome(String s) {
        String[] str=s.split("[^a-zA-Z0-9]");
        StringBuilder sb=new StringBuilder();
        StringBuilder reversesb=new StringBuilder();
        for(String st : str){
            sb.append(st.toLowerCase());
            reversesb.append(st.toLowerCase());
        }
        
        reversesb.reverse();

        return sb.toString().equals(reversesb.toString());
    }
}