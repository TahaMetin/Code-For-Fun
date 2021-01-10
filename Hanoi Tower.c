#include <stdio.h>

void towers(int, char, char, char);
int step=1;
int main()
{
    int num;
    printf("number of disk : ");
    scanf("%d", &num);
    printf("Hanoi tower steps:\n");
    towers(num, 'A', 'C', 'B');
    return 0;
}
void towers(int num, char frompeg, char topeg, char auxpeg)
{
    if (num == 1)
    {
        printf("\n%d: Disk 1   %c to %c ",step++, frompeg, topeg);
        return;
    }
    towers(num - 1, frompeg, auxpeg, topeg);
    printf("\n%d: Disk %d   %c to %c ",step++, num, frompeg, topeg);
    towers(num - 1, auxpeg, topeg, frompeg);
}
