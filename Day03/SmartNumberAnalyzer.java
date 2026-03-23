package Day03;

import java.util.Scanner;

public class SmartNumberAnalyzer {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Number: ");
        int num = sc.nextInt();

        //Logic
        if (num > 0) {
            System.out.println("Positive Number");
        }
        else if (num < 0) {
            System.out.println("Negative Number");
        }
        else  {
            System.out.println("Zero");
        }
        
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd Number");
            }
        }

        if (num % 3 ==0 || num % 5 == 0) {
            System.out.println("Divisible by 3 or 5");
        }
        else {
            System.out.println("Not Divisible by 3 or 5");
        }
        
        if (num >= 10 && num <= 20) {
             System.out.println("In range(10-20)");
        }
        else {
             System.out.println("Not in range(10-20)");
        }
        
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Special Number");
        }
        
       
        sc.close();
    }
}
