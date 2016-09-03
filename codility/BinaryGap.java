class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        int i = binary.length() - 1;
        int maxGap = 0, tempGap = 0;
        while (binary.charAt(i) == '0') {
            i--;
        }
        
        while (i >= 0) {
            if (binary.charAt(i) == '0') tempGap++;
            else if (tempGap > maxGap) {
                maxGap = tempGap;
                tempGap = 0;
            } else tempGap = 0;
            i--;
        }
        return maxGap;
    }
}
