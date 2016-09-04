class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] check = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (A[i] - 1 >= A.length) return 0; //out of range 
            check[A[i] - 1] ++;
        }
        for (int i = 0; i < A.length; i++){
            if (check[i] != 1) return 0;
        }
        return 1;
    }
}
