package LeetCodeProblem_Praju;

import java.util.Scanner;

public class FruitsSwithCaseExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number from 1-7 it will show day :");
        int day =sc.nextInt();
       /*  switch (Fruit) {
            case "Apple":
                System.out.println("Its Red fruit");
                break;
            case "Mango":
            System.out.println("King of fruits:");
            break;
            case "Orange":
            System.out.println("Jucy fruit");
         break;
            default:
            System.out.println("Fruits");
                break;
        }*/
        switch (day) {
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tusday");
            case 3->System.out.println("wendsday");
            case 4->System.out.println("Thusday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("saturday");
            case 7->System.out.println("Sunday");
        }

            
            
                
        
           
                

    }
    
}
