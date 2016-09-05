class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        
        //use prefix sums
        
        int[] numA = new int[S.length()];
        int[] numC = new int[S.length()];
        int[] numG = new int[S.length()];
        int[] numT = new int[S.length()];
        
        int[] ans = new int[P.length];
        
        if (S.charAt(0) == 'A') numA[0]++;
        else if (S.charAt(0) == 'C') numC[0]++;
        else if (S.charAt(0) == 'G') numG[0]++;
        else if (S.charAt(0) == 'T') numT[0]++;
        
        for (int i = 1, len = S.length(); i < len; i++){
            numA[i] = numA[i - 1];
            numC[i] = numC[i - 1];
            numG[i] = numG[i - 1];
            numT[i] = numT[i - 1];
            
            if (S.charAt(i) == 'A') numA[i]++;
            else if (S.charAt(i) == 'C') numC[i]++;
            else if (S.charAt(i) == 'G') numG[i]++;
            else if (S.charAt(i) == 'T') numT[i]++;
        }
        
        for (int i = 0; i < P.length; i++){
            if (P[i] == 0) {
                if (numA[Q[i]] > 0) ans[i] = 1;
                else if (numC[Q[i]] > 0) ans[i] = 2;
                else if (numG[Q[i]] > 0) ans[i] = 3;
                else if (numT[Q[i]] > 0) ans[i] = 4;
            } else {
                if (numA[Q[i]] - numA[P[i] - 1] > 0) ans[i] = 1;
                else if (numC[Q[i]] - numC[P[i] - 1] > 0) ans[i] = 2;
                else if (numG[Q[i]] - numG[P[i] - 1] > 0) ans[i] = 3;
                else if (numT[Q[i]] - numT[P[i] - 1] > 0) ans[i] = 4;
            }
        }
        
        return ans;
    }
}
