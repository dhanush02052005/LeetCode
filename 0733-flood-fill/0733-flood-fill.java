class Solution {
    public void dfs(int[][] image, int m , int n , int sr, int sc, int color , int val)
    {
        if(sr<0 || sc<0 || sr>=m || sc>=n) return;
        if(image[sr][sc]!=val) return;
        image[sr][sc] = color;
        dfs(image,m,n,sr+1,sc,color,val);
        dfs(image,m,n,sr,sc+1,color,val);
        dfs(image,m,n,sr-1,sc,color,val);
        dfs(image,m,n,sr,sc-1,color,val);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int val = image[sr][sc];
        if (val == color) return image;
        dfs(image,m,n,sr,sc,color,val);
        return image;
    }
}