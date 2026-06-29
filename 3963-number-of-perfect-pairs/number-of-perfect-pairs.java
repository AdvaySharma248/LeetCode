import java.util.Arrays;

class Solution {
    public long perfectPairs(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(arr);

        long count = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            while (j < arr.length && arr[j] <= 2L * arr[i]) {
                j++;
            }
            count += j - i - 1;
        }

        return count;
    }
}