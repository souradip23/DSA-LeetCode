class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> path=new ArrayList<>();
        backtrack(0,s,path,res);
        return res;
    }
    static void backtrack(int start, String s,List<String> path, List<List<String>> res){
        if(start==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
            path.add(s.substring(start,end+1));
            backtrack(end+1,s,path,res);
            path.remove(path.size()-1);
            }
        }
    }
    static boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}