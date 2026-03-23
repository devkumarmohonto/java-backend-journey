package Day03;

import java.util.*;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        //If=Else
        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}