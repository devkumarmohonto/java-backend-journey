package Day02;

import java.util.Scanner;

public class MulitiplicationTable {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        //Calculation
        int result1 = number * 1;
        int result2 = number * 2;
        int result3 = number * 3;
        int result4 = number * 4;
        int result5 = number * 5;
        int result6 = number * 6;
        int result7 = number * 7;
        int result8 = number * 8;
        int result9 = number * 9;
        int result10 = number * 10;


        //Output
        System.out.println(number + " x " + result1);
        System.out.println(number + " x " + result2);
        System.out.println(number + " x " + result3);
        System.out.println(number + " x " + result4);
        System.out.println(number + " x " + result5);
        System.out.println(number + " x " + result6);
        System.out.println(number + " x " + result7);
        System.out.println(number + " x " + result8);
        System.out.println(number + " x " + result9);
        System.out.println(number + " x " + result10);


        sc.close();
    }
}
