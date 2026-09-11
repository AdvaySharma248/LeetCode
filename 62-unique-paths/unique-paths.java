class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        int res = helper(m, n, map);
        return res;
    }
    public int helper(int m, int n, HashMap<String, Integer> map){
        String key = m + "," + n;
        if(map.containsKey(key)) return map.get(key);
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        map.put(key, helper(m-1, n, map) + helper(m, n-1, map));
        return map.get(key);
    }
}