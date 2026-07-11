class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
           int left=0;
           int right=str.length-1;
           while(left<right){
            String temp=str[left];
            str[left]=str[right];
            str[right]=temp;
            left++;
            right--;
           }
           StringBuilder sb=new StringBuilder();
           for(int i=0;i<str.length;i++){
            // System.out.print(str[i]);
            sb.append(str[i]);
            if(i!=str.length-1){
                sb.append(" ");
            }
           }
        return sb.toString();
    }
}