package Day02;

import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Principal: ");
        int prin = sc.nextInt();

        System.out.print("Rate: ");
        int rate = sc.nextInt();

        System.out.print("Time: ");
        int time = sc.nextInt();


        //Calculation
        int si = (prin * rate * time) / 100;


        //Output
        System.out.println("Simple Insterest: " + si);

        sc.close();
    }
}
