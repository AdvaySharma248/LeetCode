import java.util.*;

class Solution {
    ArrayList<Integer>[] tree;
    int[] count;
    int[] ans;
    int n;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        tree = new ArrayList[n];
        count = new int[n];
        ans = new int[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            tree[u].add(v);
            tree[v].add(u);
        }

        dfs1(0, -1, 0);
        dfs2(0, -1);

        return ans;
    }

    void dfs1(int node, int parent, int depth) {
        ans[0] += depth;
        count[node] = 1;

        for (int next : tree[node]) {
            if (next != parent) {
                dfs1(next, node, depth + 1);
                count[node] += count[next];
            }
        }
    }

    void dfs2(int node, int parent) {
        for (int next : tree[node]) {
            if (next != parent) {
                ans[next] = ans[node] + n - 2 * count[next];
                dfs2(next, node);
            }
        }
    }
}