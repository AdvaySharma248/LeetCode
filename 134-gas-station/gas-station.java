class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int s = 0;
        int start = 0;
        
        for(int i = 0; i < n; i++){
            total += gas[i] - cost[i];
            s += gas[i] - cost[i];
            if(s < 0){
                s = 0;
                start = i + 1;
            }
        }
        return (total < 0) ? -1 : start;
    }
}