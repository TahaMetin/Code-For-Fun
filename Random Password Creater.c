#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    printf("-------------RANDOM PASSWORD CREATER-------------\n");
//  33-126
    int i=0,a=0;
    int passLength;
    int pool[93];
    srand(time(NULL));
    int num;
    printf("length of the password: ");
    scanf("%d",&passLength);

    for(i=33;i<127;i++){
        pool[a]=i;
        a++;
    }

    for (i=0;i<passLength;i++){
        num = rand();
        num = num % 94;
        a=pool[num];
        printf("%c ",a);
    }

    return 0;
}
