class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxisland = 0;
        boolean [][]visited = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    maxisland = Math.max(maxisland, dfs(grid, visited, i, j));
                }
            }
        }
        return maxisland;
    }
    public static int dfs(int[][] grid, boolean[][] visited, int i, int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i<0 || i >= row || j < 0 || j >= col || visited[i][j] || grid[i][j] == 0){
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(grid, visited, i+1, j) + dfs(grid, visited, i, j+1) + dfs(grid, visited, i-1, j) + dfs(grid, visited, i, j-1);
    }
}