#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*

    Google interview coding challenge

    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?

    example 1 :
    Input: nums = [2,2,1]
    Output: 1

    example 2 :
    Input: nums = [4,1,2,1,2]
    Output: 4

    example 3 :
    Input: nums = [1]
    Output: 1

    */

    int lengthofNums = 5;
    int nums[] = {4,1,2,1,2};
    int ansver=0;
    for(int i = 0; i < lengthofNums ; i++){
        ansver ^= nums[i];
    }
    printf("%d",ansver);

    /*
    ^  =>  Bitwise XOR

    0101    5
     ^
    0101    5
     =
    0000    0


    0100    4
     ^
    0101    5
     =
    0001    1


    0000    0
     ^
    1111    15
     =
    1111    15

    */

    return 0;
}
