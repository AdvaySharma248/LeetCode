class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)){
            int[] freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
                if(freq[ch - 'a'] > 1){
                    return true;
                }
            }
        }
        int f = -1, se = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(f == -1){
                    f = i;
                }else if(se == -1){
                    se = i;
                }else{
                    return false;
                }
            }
        }
        return se != -1 && s.charAt(f) == goal.charAt(se) && s.charAt(se) == goal.charAt(f);
        
    }
}