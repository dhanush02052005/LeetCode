class Solution {
    public void dfs(int i , int j , char[][] board , int m , int n)
    {
        if(i>=m || j>=n || i<0 || j<0) return;
        if(board[i][j]!='O') return;
        board[i][j] = 'R';
        dfs(i+1,j,board,m,n);
        dfs(i,j+1,board,m,n);
        dfs(i-1,j,board,m,n);
        dfs(i,j-1,board,m,n);
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==m-1 || j==n-1) 
                {
                    dfs(i,j,board,m,n);
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O') board[i][j] = 'X';
                if(board[i][j]=='R') board[i][j] = 'O';
            }
        }
    }
}