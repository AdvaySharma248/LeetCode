class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int per = n / 4;
        int count = 1;
        int p = arr[0];
        for (int i = 1 ; i < n ; i++) {

            if ( p == arr[i]) count++;
            else count = 1;
            
            if (count > per) return arr[i];
            
            p = arr[i];
        }

        return p;
    }
}