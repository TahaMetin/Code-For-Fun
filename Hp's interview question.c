#include <stdio.h>
#include <stdlib.h>

int main()
{
    //Sana N tane sayı içeren bir liste  ve bir K sayısı veriyorlar.
    //Çıktı listedeki en küçük ve K sayısı kadar tekrar eden (listede K kadar olan) sayı olacak.
    //Listede K kadar tekrar eden bir sayı her zaman olacak.
    //
    //  Girdi               Çıktı
    //
    //  5
    //  2 2 1 3 1           1
    //  2
    //
    //
    // SORUNUN ORİJİNALİ:
    //
    //You are given an array a with N integers and an integer K.
    //Output the smallest number in array which occurs exactly K times in an array.
    //There will always be a number that is occurring K times.
    //
    //  Input               Output
    //
    //  5
    //  2 2 1 3 1           1
    //  2
    //
    //NOTE: I saw this question on instagram. They say it's hp's interview question.
    //NOT: Soruyu instagramda gördüm.Hp'nin mülakat sorusu olduğunu söyliyorlardı.


    int n;
    int k;
    int RNarraySize=0;  // 77. satırda i nin kaça kadar gideceğini belirlemeye yarıyor
    printf("N: ");
    scanf("%d",&n);
    int array[n];
    for(int i=0;i<n;i++){
        printf("%d. integer : ",i+1);
        scanf("%d",&array[i]);
    }
    printf("K: ");
    scanf("%d",&k);

    //32-42 arası değişkenleri tanımlama ve kullanıcıdan değişkenleri almayı sağlıyor.
    //32-42 lines for define variables and take values from user.

    //Problemi çözmek için ilk önce K kere tekrar eden sayıları bulup
    //sonra o sayıların en küçüğünü bulmalıyız.
    //Önce küçük sayıyı bulup sonra sayının kaç kere tekrar ettiğini kontrol edersek
    //program daha verimsiz çalışır
    //
    //For solve the problem firstly we should fine the numbers who repeat K times.
    //After this we should find the lowest number.
    //If we firstly found the lowest number and secondly check how many times it's repeat in array
    //program will be work less effeciently

    int repeatingNumbers[RNarraySize]; // k kadar olan sayılar bu listeye kaydedilecek
    int check=0; //sayının kaç kez olduğu bu değişken arttırılarak kontrol edilecek
    int a=0; // k kadar olan sayıları listeye kaydederken index olarak kullanılacak
    for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){   //tekrar eden sayıyı tekrar ettiği kadar kaydettiğini unutma
            if(array[i]==array[j])
                check++;
        }
        if(check==k){
            repeatingNumbers[a]=array[i];
            a++;
            RNarraySize++;
        }
        check=0;
    }

    int lowestNumber=repeatingNumbers[0];
    int number;
    for(int i=1;i<RNarraySize;i++){
        if(repeatingNumbers[i]<lowestNumber){
            lowestNumber=repeatingNumbers[i];
        }
    }
    printf("\n\nAnswer: %d\n",lowestNumber);

    return 0;
}
