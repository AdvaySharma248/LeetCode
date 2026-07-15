class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0, oddSum = 0;
        for(int i = 1; i <= n*2; i++){
            if(i%2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        return gcd(evenSum, oddSum);
    }
    private int gcd(int evenSum, int oddSum){
        int min = Math.min(evenSum, oddSum);
        for(int i = min; i >= 1; i--){
            if(evenSum%i == 0 && oddSum%i == 0){
                return i;
            }
        }
        return 0;
    }
}