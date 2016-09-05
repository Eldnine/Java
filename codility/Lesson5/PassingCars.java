class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int numEast = 0, sum = 0;
        
        for (int i = 0; i < A.length; i++){
            if (A[i] == 0) numEast++;
            else {
                sum += numEast;
            }
        }
        if (sum > 1000000000 || sum < 0) return -1;
        return sum;
    }
}
