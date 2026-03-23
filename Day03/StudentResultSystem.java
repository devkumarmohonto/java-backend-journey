package Day03;

import java.util.Scanner;

public class StudentResultSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Math: ");
        int math = sc.nextInt();
        System.out.print("English: ");
        int english = sc.nextInt();
        System.out.print("Science: ");
        int science = sc.nextInt();

        //Calculation
        int total = math + english + science;
        double average = total / 3.0;

        //Output
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        
        //Grade
        if (average >= 80) {
            System.out.println("A");
        }
        else if (average >= 60) {
            System.out.println("B");
        }
        else if (average >= 50) {
            System.out.println("C");
        }
        else if (average >= 40) {
            System.out.println("D");
        }
        else {
            System.out.println("Fall");
        }

        //Pass Condition
        if (math >= 40 && english >= 40 && science >= 40) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
