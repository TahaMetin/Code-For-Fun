public class GoogleInterviewCodingChallenge3 {
    public static void main(String[] args) {

        /*

        Given an array nums containing n distinct numbers in the range [0,n], retrun the only number in the range
        thas is missing from the array.

        follow up : Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity ?

        example 1:
        Input  nums = [3,0,1]
        Output: 2
        Explanation: n=3 since there are 3 numbers, so all numbers are in the range [0,3].
        2 is the missing number in the range since it does not appear in nums.

        example 2:
        Input  nums = [0,1]
        Output: 2
        Explanation: n=2 since there are 2 numbers, so all numbers are in the range [0,2].
        2 is the missing number in the range since it does not appear in nums.

        example 3:
        Input  nums = [9,6,4,2,3,5,7,0,1]
        Output: 8

        */

        int[] nums = {3,0,1};
        int[] nums1 = {0,1};
        int[] nums2 = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber(nums2));

    }

    static int missingNumber(int[] nums){
        int res = 0;
        for(int i = 0; i<nums.length;i++){
            res ^= nums[i];
        }
        for(int i = 1; i<= nums.length;i++){
            res ^= i;
        }

        return res;
    }

}
