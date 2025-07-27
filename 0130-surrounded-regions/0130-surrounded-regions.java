class Solution {
    public void solve(char[][] b) {
        int r=b.length;
        int c=b[0].length;

        for( int i=0;i<r;i++){
            change (b,i,0);
            change( b,i,c-1);
        }
        for(int j=0;j<c;j++){
            change(b,0,j);
            change(b,r-1,j);
        }
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(b[i][j]=='O'){
                    b[i][j]='X';
                }
                if(b[i][j]=='M'){
                    b[i][j]='O';
                }
            }
        }
    }

        public void change (char[][] b , int i, int j){
            int r=b.length;
            int c=b[0].length;

            if(i<0 || j<0 || i>=r || j>=c ||  b[i][j]=='X' || b[i][j]=='M'){
                return;
            }

                b[i][j]='M';
                change(b,i-1,j);
                change(b,i+1,j);
                change(b,i,j-1);
                change(b,i,j+1);

            
        }
        
    
}