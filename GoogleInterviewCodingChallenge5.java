public class GoogleInterviewCodingChallenge5 {
    public static void main(String[] args) {
        /*

        Given an array nums, write a function to move all 0's to the end of  it while maintaining the relative order
        of the non-zero elements.

        Example:
        Input: [0,1,0,3,12]
        Output: [1,3,12,0,0]

        Note:
        1. You must do this in-plate without making a copy of the array.
        2. Minimize the total number of operations.

         */
        
        int[] arr = {0,1,2,3,4,5,6,0,7};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
    
    static void moveZeroes(int[] nums){
        int j =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
