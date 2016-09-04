class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        //get minimum
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++){
            if (min > A[i]) min = A[i];
        }
        
        //
        int[] check = new int[A.length];
        for (int i = 0; i < A.length; i++){
            check[A[i] - min]++;
        }
        
        int i = 0;
        while (check[i] !=0){
            i++;
        }
        return i + min;
    }
}
