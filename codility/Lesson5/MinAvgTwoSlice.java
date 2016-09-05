class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        // the tricky part: the min average must be from 2slice or 3slice 
        // (think that if 4slice is thiner than the 3slice within it, so then there must be a 2slice with this 4slice thiner than this 4slice)
        double min = Double.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < A.length - 2; i++){

            if ((A[i] + A[i + 1])/2.0 < min || (A[i] + A[i + 1] + A[i + 2])/3.0 < min){
                ans = i;
                min = Math.min((A[i] + A[i + 1])/2.0, (A[i] + A[i + 1] + A[i + 2])/3.0); //care double type
            }
        } 
        
        if ((A[A.length - 1] + A[A.length - 2])/2 < min) ans = A.length - 2;
        
        return ans;
    }
}
