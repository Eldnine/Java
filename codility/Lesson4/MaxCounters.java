class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        
        //instead of updating all when max counter occurs, we update each one when it's increased
        int[] counter = new int[N];
        int max = 0, tempMax = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] < N + 1) {
                if (counter[A[i] - 1] < tempMax) counter[A[i] - 1] = tempMax;
                counter[A[i] - 1]++;
                if (counter[A[i] - 1] > max) max = counter[A[i] -1];
            } else {
                tempMax = max;
            }
        }
        
        for (int i = 0; i < N; i++){
            if (counter[i] < tempMax) counter[i] = tempMax;
        }
        
        return counter;
    }
}
