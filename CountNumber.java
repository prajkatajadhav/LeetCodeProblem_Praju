package LeetCodeProblem_Praju;
/* Question eg: input is give 12344456 
 * find out count  of 4 number in given number
 */
/*Solution
 Logic 
 R=n%10;
 if(R==Give nuber){ count++}
n=n/10;
 */
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        //int n= 3424245;
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the Number to find out the repated no form input ");
        int n = 234467534;
        int count =0;
        while (n>0) {
            int Rem= n%10;//n%10 mean the out will be 23446753
            if (Rem==4) {//then rem is 4 and it will check that 4==4 then it increase with 1
                count++;
            }
            n=n/10;

            
        }
        System.out.println("No of Repated Count in the Given No is : "+ count );

    }
    
}
