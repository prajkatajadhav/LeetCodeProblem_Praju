package LeetCodeProblem_Praju;

import java.util.Scanner;

public class CalculateMean {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int sum = 0, count = 0;
 
    // Check if an int value is available
    while (sc.hasNextInt()) {
        // Read an int value
        int num = sc.nextInt();
        sum += num;
        count++;
    }
    if (count > 0) {
        int mean = sum / count;
        System.out.println("Mean: " + mean);
    }
    else {
        System.out.println(
            "No integers were input. Mean cannot be calculated.");
    }
  }  
}
