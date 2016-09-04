class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int pair = 0;
        for (int i = 0; i < A.length; i++) {
            pair ^= A[i];
        }
        return pair;
    }
}
