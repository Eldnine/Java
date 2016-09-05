import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 3) return 0;
        
        Arrays.sort(A);
        
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] - A[i - 1] < A[i - 2]) return 1; //in case of overflow
        }
        
        return 0;
    }
}
