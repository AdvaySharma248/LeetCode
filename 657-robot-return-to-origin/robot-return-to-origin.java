class Solution {
    public boolean judgeCircle(String moves) {
        int freq[]=new int[26];
        for(char ch:moves.toCharArray()){
         freq[ch-'A']++;
        }
        if(freq[11]==freq[17]&&freq[20]==freq[3]){
           return true;
        }
        return false;
    }
}