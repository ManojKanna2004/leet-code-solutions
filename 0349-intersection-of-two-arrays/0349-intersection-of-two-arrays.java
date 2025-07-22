class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>  set= new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        int arr[] =new int[ans.size()];
        for(int i=0;i<ans.size();i++){
             arr[i]= ans.get(i) ;       }
        return arr;
    }
}