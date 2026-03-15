package Day02;

import java.util.Scanner;

public class AgeCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Birth Year: ");
        int birth = sc.nextInt();

        System.out.print("Current Year: ");
        int current = sc.nextInt();


        //Calculation
        int age = current - birth;


        //Output
        System.out.print("Hello " + name);
        System.out.print("Age: " + age);

        sc.close();
    }
}
