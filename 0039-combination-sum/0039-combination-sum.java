class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(0,candidates,target,list,res);
        return res;
    }
    private void backtrack(int index,int[] candidates, int target,List<Integer>list,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index==candidates.length || target<0){
            return;
        }
        //take
        list.add(candidates[index]);
        backtrack(index,candidates,target-candidates[index],list,res);
        list.remove(list.size()-1);
        //skip
         backtrack(index+1,candidates,target,list,res); //backtrack
    }
}