class Solution {
    public void solve(char[][] g) {
         int r=g.length;
            int c=g[0].length;
        for(int i=0;i<r;i++){
            change(g,i,0);
            change(g,i,c-1);
        }
        for(int j=0;j<g[0].length;j++){
        change(g,0,j);
            change(g,r-1,j);
        }
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]=='O'){
                        g[i][j]='X';
                }
                if(g[i][j]=='M'){
                        g[i][j]='O';
                }
                
            }
        }

    }
    public void change(char g[][], int i , int j){
            int r=g.length;
            int c=g[0].length;

            if(i<0|| j<0 || i>=r || j>=c || g[i][j]=='X'|| g[i][j]=='M'){
                return;
            }
            g[i][j]='M';
            change(g,i-1,j);
            change(g,i+1,j);
            change(g,i,j-1);
            change(g,i,j+1);
                    }
 
}