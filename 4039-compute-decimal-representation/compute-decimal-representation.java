class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        int count = 0;
        boolean flag = true;
        while(n != 0){
            int d = n%10;
            if(d != 0){
                ls.add((int)(d*Math.pow(10, count)));
            }
            count++;
            n /= 10;
        }
        int[] arr = new int[ls.size()];
        int j = 0;
        for(int i = ls.size()-1; i >= 0 && j < ls.size() ; i--){
            arr[i] = ls.get(j++);
        }
        return arr;
    }
}