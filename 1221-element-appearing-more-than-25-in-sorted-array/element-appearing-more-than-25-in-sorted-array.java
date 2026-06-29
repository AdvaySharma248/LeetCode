class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int per = n / 4;
        for(int i = 0; i < n - per; i++){
            if(arr[i] == arr[i+per]){
                return arr[i];
            }
        }
        return -1;
    }
}