public class GoogleInterviewCodingChallenge6 {
    public static void main(String[] args) {
        /*

        Given a non-empty array of decimal digits representing a non-negative integer,
        increment one to the integer.

        The digits are stored such that the most significant digit is at the head of the list,
        and each element in the array contains a single digit.

        You may assume the integer does not contain any leading zero, except the number 0 itself.

        Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.

        Example 2:
        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.

        Example 3:
        Input: digits = [0]
        Output: [1]

         */

        int[] arr = {1,2,1};
        int[] arr2 = PlusOne(arr);
        for(int i = 0 ;i <arr2.length;i++){
            System.out.print(arr2[i]+ " ");
        }
    }

    public static int[] PlusOne(int[] digits){
        int hand=0;
        for (int i = digits.length-1; i >= 0; i--) {
            hand =0;
            digits[i]++;
            if(digits[i] == 10){
                digits[i]=0;
                hand = 1;
            }else{
                break;
            }
        }
        if(hand == 1){
            int [] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return  digits;
    }
}
