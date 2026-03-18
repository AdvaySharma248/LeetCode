class Solution {
    int count  = 0;
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(i, vis, isConnected);
                count++;
            }
        }
        return count;
    }
    public void dfs(int i, boolean[] vis, int[][] isConnected){
        vis[i] = true;

        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && !vis[j]){
                dfs(j, vis, isConnected);
            }
        }
    }
}