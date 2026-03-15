package Day02;

import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //Calculation
        double area = 3.14 * radius * radius;

        //Output
        System.out.println("Area of Circle: " + area);

        sc.close();
    }
}
