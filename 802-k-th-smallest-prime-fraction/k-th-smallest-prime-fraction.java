class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<double[]> decimals = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                decimals.add(new double[]{
                    (double) arr[i]/arr[j],
                    (double)arr[i],
                    (double)arr[j]
                });
            }
        }
        decimals.sort((a, b) -> Double.compare(a[0], b[0]));
        double[] kt = decimals.get(k-1);
        
        return new int[]{
            (int)kt[1],
            (int)kt[2]
        };
    }
}