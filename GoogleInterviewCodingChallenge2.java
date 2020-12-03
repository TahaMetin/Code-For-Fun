import java.util.HashMap;
import java.util.Map;

public class GoogleInterviewCodingChallenge2  {
    public static void main(String[] args) {

        /*

        Given an array of integers nums and an integer target, return indices of the two numbers such that
        they add up to target.

        you may assume that each input would be have exactly one solution, and you may not use the same element twice.

        you can return the answer in any order

        example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0,1].

        example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        */

        int[] arr = {2,7,11,15};
        int[] res = find(arr,9);

        System.out.println(res[0] + " " + res[1]);
    }

    static int[] find(int[] nums, int target){
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }

        return res;
    }

}
