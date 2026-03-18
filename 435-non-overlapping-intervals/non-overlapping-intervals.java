class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int prev = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i][0] >= arr[prev][1]) {
                prev = i;
                count++;
            }
        }
        return n - count;
    }
}