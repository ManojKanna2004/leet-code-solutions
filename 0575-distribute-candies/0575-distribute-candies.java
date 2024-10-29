class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
           set.add(candyType[i]);
        }
        if((candyType.length/2)>set.size())return set.size();
        return candyType.length/2;
    }
}