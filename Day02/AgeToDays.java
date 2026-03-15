package Day02;

import java.util.Scanner;

public class AgeToDays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Age = ");
        int age = sc.nextInt();

        //Calculation
        int days = age * 365;

        //Output
        System.out.println("You lived approximately " + days + " days");

        sc.close();
        
    }
}
