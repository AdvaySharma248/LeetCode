class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, space = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'L') left++;
            if(ch == 'R') right++;
            if(ch == '_') space++;
        }
        return Math.abs(left - right) + space;
    }
}