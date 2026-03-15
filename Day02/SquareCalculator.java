package Day02;

import java.util.Scanner;

public class SquareCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Calculation
        int square = num * num; 

        //Output
        System.out.println("Square is: " + square);

        sc.close();
    }
}
