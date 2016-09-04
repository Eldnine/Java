class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++){
            if (min > A[i]) min = A[i];
        }
        
        int[] check = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (A[i] - min >= A.length) continue;
            check[A[i] - min]++;
        }
        
        int i = 0;
        while (i < A.length && check[i] !=0){
            i++;
        }
        return i + min;
    }
}
