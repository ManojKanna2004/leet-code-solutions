class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans=new int[rows*cols][2];
        int idx=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[idx][0]=i;
                ans[idx++][1]=j;
            }
        }

        Arrays.sort(ans,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                int x=Math.abs(a[0]-rCenter)+Math.abs(a[1]-cCenter);
                int y=Math.abs(b[0]-rCenter)+Math.abs(b[1]-cCenter);
                return x-y;
            }
        });

        return ans;
    }
}