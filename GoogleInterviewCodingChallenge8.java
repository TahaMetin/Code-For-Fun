public class GoogleInterviewCodingChallenge8 {
    public static void main(String[] args) {

        /*

        Write a function that takes ana unsigned integer and returns the number of '1' bits it has
        (also known as the Hamming Weight)

        Note:
        -Noket that in some languages such as java, there is no unsigned integer type. In this case,
        the input will be given as a signed integer type. It should not affect your implementation,
        as the integer's internal binary representation is the same,
        whether it is signed or unsigned.
        -In java, the compiler represents the signed integers using 2's complement notation.
        Therefore, in Example 3 above, the input represents the signed integer. -3.

        Follow up: If this function called many times, how would you optimize it?

        Example 1:
        Input: n = 000000000000000000000000000000000001011
        Output: 3
        Explanation: The input binary string 000000000000000000000000000000000001011 has a total of three '1' bits.

        Example 2:
        Input: n = 000000000000000000000000100000000000000
        Output: 1

        Example 1:
        Input: n = 000000000000000000000000000000000001011
        Output: 3
        Explanation: The input binary string 000000000000000000000000000000000001011 has a total of three '1' bits.


         */

        System.out.println(hammingWeight(3));
        System.out.println(hammingWeight(6));
        System.out.println(hammingWeight(7));
    }

    static  int hammingWeight(int n){
        int result=0;
        while(n>0){
            result += n&1; // bitleri karşılaştırıp ortak bitleri 1 ortak olmayanları 0 yapar.  &1 ifadesi yerine %2 de kullanılabilir.
            n >>>= 1; // 32 bit sayı için bitleri 1 sağa kaydırma işlemi
        }
        return result;
    }
}
