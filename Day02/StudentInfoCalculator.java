package Day02;
import java.util.Scanner;

public class StudentInfoCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Math: ");
        int mathmark = sc.nextInt();

        System.out.print("English: ");
        int englishmark = sc.nextInt();

        System.out.print("Scienc: ");
        int sciencemark = sc.nextInt();


        //Calculation
        int total = mathmark + englishmark + sciencemark;
        int average = total / 3; 

        //Output
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Age: ");
        System.out.println(age);
        System.out.print("Total: ");
        System.out.println(total);
        System.out.print("Average: ");
        System.out.print(average);

        sc.close();
        
    }
}
