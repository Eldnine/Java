class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if (X==Y) return 0;
        return (Y - X - 1)/D + 1;
    }
}
