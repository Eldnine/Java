class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A == 0) return B/K + 1;
        return B/K - (A - 1)/K;
    }
}
