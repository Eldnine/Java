class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0, realSum = 1;;
        for (int i = 0; i < A.length; i++){
            sum += A[i];
            realSum += i + 2;
        }
        return realSum - sum;   
    }
}
