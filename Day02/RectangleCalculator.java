package Day02;

import java.util.Scanner;

public class RectangleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        //Input
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();

        //Calculation
        int area = length * width;
        int perimeter = 2 * (length + width);

        //Output
        System.out.print("Area: ");
        System.out.println(area);
        System.out.print("Perimeter: ");
        System.out.println(perimeter);

        sc.close();
        
    }
}
