class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++){
            if (A[i] < 0) continue;
            if (min > A[i]) min = A[i];
        }
        
        int[] check = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (A[i] - min >= A.length || A[i] < 0) continue;
            check[A[i] - min]++;
        }
        
        int i = 0;
        while (i < A.length && check[i] !=0){
            i++;
        }
        
        if (i + min <= 0 || min == Integer.MAX_VALUE || min > 1) return 1; // min not changed (all negative)
        return i + min;
    }
}
