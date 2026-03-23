package Day03;

import java.util.Scanner;

public class SmartNumberGame {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        //Logic
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        if (number % 2 == 0 && number % 3 ==0) {
            System.out.println("Super Even Number");
        }
        if (number % 2 != 0 && number % 5 == 0) {
            System.out.println("Magic Number");
        }
        if (number >= 1 && number <= 100) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }
        if (number % 2 == 0 && number % 5 == 0 && number >=1 && number <= 100) {
            System.out.println("Ultimate Number");
        }
        if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0){
            System.out.println("Master Number 👑");
        }

        sc.close();
    }
}
