package LeetCodeProblem_Praju;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= sc.nextInt();

        while (n>0) {
            int Rem = n%10;
            n=n/10;
            ans = ans *10 +Rem;

            
        }
        System.out.println( "Reverse number is :"+ans);
    }
}
