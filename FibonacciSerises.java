package LeetCodeProblem_Praju;
/*Question find fibonacc series  */
/*solution :a=0;b=1;count= 2;
 * while (count<2)
 * temp=b;
 * b= b+a;
 * a= temp;
 * count++
 */
import java.util.Scanner;

public class FibonacciSerises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for FibonacciSeries: ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int count =2;
        
        while (count<=n) {
           int  temp= b;
           b= b+a;
           a= temp;
           count ++;


            
        }
        System.out.println(b);
    }
}
