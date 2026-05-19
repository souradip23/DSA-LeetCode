class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num :nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                list.add(num);
            }
        }
        Collections.sort(list);
        if(list.size()==0)return -1;
        return list.get(0);
    }
}