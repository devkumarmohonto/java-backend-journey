package Day02;

import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Celsius: ");
        int celsius = sc.nextInt();

        //Calculation
        int fahrenhit = (celsius * 9/5) + 32;

        //Output
        System.out.print("Fahrenhit: " + fahrenhit);

        sc.close();

    }
}
