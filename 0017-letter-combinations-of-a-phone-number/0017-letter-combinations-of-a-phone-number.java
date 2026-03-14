class Solution {
   static  String[] map={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz","*","0","#"
    };
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(0,digits,sb,ans);
        return ans;
    }
    static void backtrack(int index,String digits,StringBuilder sb,List<String> ans){
        if(index==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letter=map[digits.charAt(index)-'0'];
        for( char ch: letter.toCharArray()){
            sb.append(ch);
            backtrack(index+1,digits,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}