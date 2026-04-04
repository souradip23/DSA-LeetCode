class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] str=s.split(" ");
        if(str.length!=pattern.length())return false;
        HashMap<Object,Integer> map=new HashMap<>();
        for(Integer i=0;i<str.length;i++){
            if(!Objects.equals(map.put(pattern.charAt(i),i),
            map.put(str[i],i))){
                return false;
            }
        }
        return true;
    }
}