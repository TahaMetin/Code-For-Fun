import java.util.HashMap;
import java.util.Map;

public class GoogleInterviewCodingChallenge12 {
    public static void main(String[] args) {
        /*
        * You are given an integer array NUMS and ana integer K.
        *
        * In one operation, you can pick two numbers from the array whose sum equals K and remove them from the array.
        *
        * Return the maximum number of operations you can perform on the array.
        *
        * Example 1:
        * Input: nums = [1,2,3,4], k=5
        * Output: 2
        * Explanation: Starting with nums = [1,2,3,4]:
        * - Remove numbers 1 and 4, then nums = [2,3]
        * - Remove numbers 2 and 3, then nnums = []
        * There are no more pairs that sum up to 5, hence a total of 2 operations.
        *
        * Example 2:
        * Input: nums = [3,1,3,4,3], k = 6
        * Output: 1
        * Explanation: Starting with nums = [3,1,3,4,3]:
        * - Remove the first two 3's, then nums = [1,4,3]
        * There are no more pairs that sum up to 6, hence a total of 1 operation.
        * */

        int[] arr = {3,1,3,4,3};
        System.out.println(maxOperations(arr,6));

    }

    static public int maxOperations(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0){
                res++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }

        return res;
    }
}
