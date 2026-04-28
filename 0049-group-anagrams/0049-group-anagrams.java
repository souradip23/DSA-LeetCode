class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> mp = new HashMap<>();
        
        for (String x : strs) {
            char[] wordArray = x.toCharArray();
            Arrays.sort(wordArray);
            String key = new String(wordArray);
            
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(x);
        }
        
        List<List<String>> ans = new ArrayList<>();
        for (List<String> group : mp.values()) {
            ans.add(group);
        }
        
        return ans;
    }
}