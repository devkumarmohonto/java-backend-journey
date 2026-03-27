package Day04;

import java.util.Scanner;

public class SmartCalculatorPlusPlus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter Operator: ");
        String op = sc.next();

        //Condition
        int result = 0;

        if (op.equals("+")) {
            result = (firstNumber + secondNumber);
        } 
        else if (op.equals("-")) {
            result = (firstNumber - secondNumber);
        }
        else if (op.equals("*")) {
            result = (firstNumber * secondNumber);
        }
        else if (op.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Cannot divide by Zero ❌");
                return;
            } else {
                result = (firstNumber / secondNumber);
            }
        }
        else if (op.equals("%")) {
            result = (firstNumber % secondNumber);
        }
        else {
            System.out.println("Invalid Operator");
            return;
        }
        

        //Output
        System.out.println(result);

        if (result < 0) {
            System.out.println("Negative Result");
        }
        

        sc.close();
    }
}
