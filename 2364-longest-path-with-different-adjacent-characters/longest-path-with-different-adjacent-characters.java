class Solution {
    ArrayList<Integer>[] tree;
    int ans = 1;
    String s;
    public int longestPath(int[] parent, String s) {
        int n = parent.length;
        this.s = s;
        tree = new ArrayList[n];
        for(int i = 0; i < n; i++){
            tree[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            tree[parent[i]].add(i);
        }
        dfs(0);
        return ans;
    }
    public int dfs(int node){
        int firstmax = 0;
        int secondmax = 0;
        for(int child : tree[node]){
            int childLen = dfs(child);
            if(s.charAt(node) == s.charAt(child)) continue;
            if(childLen > firstmax){
                secondmax = firstmax;
                firstmax = childLen;
            }else if(childLen > secondmax){
                secondmax = childLen;
            }
        }
        ans = Math.max(ans, firstmax + secondmax + 1);
        return firstmax+1;
    }
}