class Solution {
    public int getSum(int a, int b) {
        int carry = (a&b)<<1;

        int sum= a^b;
        return sum+carry;
        
    }
}