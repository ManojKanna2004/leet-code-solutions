class Solution {
    public int numIslands(char[][] g) {
        int co=0;

        for(int i=0;i<g.length;i++){
             for(int j=0;j<g[0].length;j++){
                if(g[i][j]=='1'){
                    makezero(g,i,j);
                    co++;
                }
             }
        }
        return co;
    }
    public void makezero(char[][] g,int i,int j) {
        int r=g.length;
        int c=g[0].length;
        if(i<0 || i>=r || j<0 || j>=c || g[i][j]=='0'){
            return;
        }
        g[i][j]='0';
        makezero(g,i-1,j);
        makezero(g,i+1,j);
        makezero(g,i,j-1);
        makezero(g,i,j+1);
    }
}           