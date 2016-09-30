// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        long ans = (long) (len * (len - 1)) / 2;
        int[] right = new int[len];
        int[] dpRight = new int[len];
        int[] left = new int[len];
        
        //set up the bounds
        for (int i = 0; i < len; i++) {
            if (i <= A[i]) left[i] = 0; //pay attention to overflow
            else left[i] = i - A[i];
             
            if (A[i] > len - 1 - i) {//pay attention to overflow, not write in A[i] + i > len - 1
                right[i] = len - 1;
            }
            else right[i] = i + A[i];
            
            dpRight[right[i]] ++;
        }
        
        for (int i = 1; i < len; i++) {
            dpRight[i] += dpRight[i - 1];
            //System.out.println(dpRight[i]);
        }
        
        for (int i = 0; i < len; i++) {
            if (left[i] - 1 < 0) continue;
            ans -= dpRight[left[i] - 1];
            //System.out.println(ans);
        }
        
        if (ans > 10000000) ans = -1;
        
        return (int) ans;
    }
}
