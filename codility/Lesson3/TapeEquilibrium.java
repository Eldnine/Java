class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int left = 0, right = 0, min = Integer.MAX_VALUE, diff;
        for (int i = 0; i < A.length; i++){
            right += A[i];
        }
        
        for (int i = 0; i < A.length - 1; i++){
            left += A[i];
            right -= A[i];
            
            diff = left - right;
            
            if(diff < 0) diff *= -1;
            if(diff < min) min = diff;
        }
        return min;
    }
}
