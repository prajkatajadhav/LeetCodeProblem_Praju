package LeetCodeProblem_Praju;

import java.util.Scanner;

public class MaxValue {
   
    public static void main(String[] args) {
       // @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int max =0;
        if(a>b){
           max=a;
        }
        else{
          max=b;
        }
        if (c>max) 
        {
          max=c;  
        }

        System.out.println(max + "Is the Maximum Value");

    }
}
