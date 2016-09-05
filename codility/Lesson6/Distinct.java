import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;
        Arrays.sort(A);
        int num = 1;
        for (int i = 1; i < A.length; i++){
            if (A[i] != A[i - 1]) num++;
        }
        return num;
    }
}
