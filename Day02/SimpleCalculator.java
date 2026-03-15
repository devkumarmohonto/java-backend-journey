package Day02;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        //Calculation
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int divi = a / b; 

        //Output
        System.out.print("Sum: ");
        System.out.println(sum);
        System.out.print("Subtraction: ");
        System.out.println(sub);
        System.out.print("Multiplication: ");
        System.out.println(mul);
        System.out.print("Division: ");
        System.out.println(divi);

        sc.close();
    }
    
}
