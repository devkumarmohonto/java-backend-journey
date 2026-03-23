package Day03;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Choose Operation: ");
        System.out.println("1 : +");
        System.out.println("2 : -");
        System.out.println("3 : *");
        System.out.println("4 : /");
        System.out.println("5 : %");

        int operation = sc.nextInt();

        switch(operation){
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                System.out.println("Result = " + (a / b));
                break;
            case 5: 
                System.out.println("Resutl = " + (a % b));
                break;
            default:
                System.out.println("Invalid Operation");
        }

        sc.close();
    }
}
