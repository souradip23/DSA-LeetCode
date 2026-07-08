class Solution {
    public boolean isPalindrome(String s) {
        // String[] str=s.split("[^a-zA-Z0-9]");
        // StringBuilder sb=new StringBuilder();
        // StringBuilder reversesb=new StringBuilder();
        // for(String st : str){
        //     sb.append(st.toLowerCase());
        //     reversesb.append(st.toLowerCase());
        // }

        // reversesb.reverse();

        // return sb.toString().equals(reversesb.toString());

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}