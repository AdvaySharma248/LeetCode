class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            int a = freq[i];

            if(a == 0) continue;
            int d = 0;
            for(int j = 0; j < 26; j++){
                int b = freq[j];
                if(b == 0) continue;

                if(b < a){
                    d += b;
                }else if(b > a + k){
                    d += b - (a + k);
                }
            }
            ans = Math.min(ans, d);
        }
        return ans;
    }
}