package Day02;

import java.util.Scanner;

public class MinutesToSeconds {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        //Calculation
        int sec = minutes * 60; 

        //Output
        System.out.println("Secends: " + sec);

        sc.close();
    }
}
