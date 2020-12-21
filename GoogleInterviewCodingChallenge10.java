public class GoogleInterviewCodingChallenge10 {
    public static void main(String[] args) {
        /*
        * A peak element is an element that is strictly greater than its neighbors.
        *
        * Given an integer array NUMS, find a peak element, and return its index. if the array
        * contains multiple peaks, return the index to any of the peaks.
        *
        * You may imagine that NUMS[-1] = NUMS[n] = -∞.
        *
        * Example 1:
        * Input: nums = [1,2,3,1]
        * Output: 2
        * Explanation: 3 is a peak element and your function should return the index number 2.
        *
        * Example 2:
        * Input: nums = [1,2,1,3,5,6,4]
        * Output: 5
        * Explanation: Your function can return either index number 1 where the peak element is 2,
        *  or index number 5 where the peak element is 6.
        * */

        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
        int[] nums2 = {1,2,3,1};
        System.out.println(findPeakElement(nums2));
    }

    static public int findPeakElement(int[] nums){
        if(nums.length ==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;

        for(int i = 1; i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        return -1;
    }

}
