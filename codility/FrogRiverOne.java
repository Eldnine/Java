//Excited! Write this program to +1s

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        int[] check = new int[X];
        int maxMin = 0;
        
        for (int i = 0; i < A.length; i++){
            if (check[A[i] - 1] == 0) check[A[i] - 1] = i + 1;
        }
        
        for (int i = 0; i < X; i++){
            if (check[i] == 0) return -1;
            if (check[i] > maxMin) maxMin = check[i];
        }
        
        return maxMin - 1;
    }
}
