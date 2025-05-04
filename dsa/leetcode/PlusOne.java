package dsa.leetcode;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        int [] result = new int[n+1];

        int m = n;
        Integer carry = 1;
        for(int i = n-1; i>=0 ; i--){

            Integer currSum = digits[i] + carry;

            if(currSum.toString().length() == 1){
                result[m--] = currSum;
                carry = 0;
            }else{
                result[m--] = currSum % 10;
                carry = currSum / 10;
            }
        }
        if (carry > 0) {
            result[0] = carry;
            return result;
        }

        return java.util.Arrays.copyOfRange(result, 1, n + 1);
    }
}
