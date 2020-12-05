import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleInterviewCodingChallenge4 {
    public static void main(String[] args) {
        /*

        Write an algorithm to determine if a number n is "happy".

        A happy number is a number defined by the following process: Starting with any positive integer, replace
        the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where ir will stay),
        or it loops endlessly in a cycle which doesn not include 1. Those numbers for wich this process ends in 1 are happy numbers.

        Return true if n is a happy number, and false if not.

        Example:
        Input: 19
        Output: True
        Explanation:
        1² + 9² = 82
        8² + 2² = 68
        6² + 8² = 100
        1² + 0² + 0² = 1

         */
        Scanner sc = new Scanner(System.in);

        int input;
        System.out.println("Enter 0 for exit.");
        do{
            System.out.print("Enter the number: ");
            input = sc.nextInt();
            System.out.println("input :" + input + " --> " + IsNumberHappy(input));
        }while(input>0);
    }

    public static boolean IsNumberHappy(int input){
       int tekrar = 0;
       int toplam=0;
       List<Integer> toplamlar = new ArrayList<Integer>();
        while(tekrar<1){
            toplam = 0;
            while(input>0){
                toplam += (input%10) * (input%10);
                input /= 10;
            }
            input = toplam;
            //System.out.println("toplam ->  " + toplam);   //fast debugging print :D
            for(int i = 0; i< toplamlar.size();i++){
                if(toplam== toplamlar.get(i)){
                    return input==1;
                }
            }
            toplamlar.add(toplam);
        }

        return input==1;
    }
}
