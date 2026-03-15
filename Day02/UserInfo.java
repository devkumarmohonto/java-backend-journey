package Day02;

import java.util.Scanner;

public class UserInfo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.print("My name is ");
        System.out.println(name);

        System.out.print("I am ");
        System.out.print(age);
        System.out.print(" years old");

        sc.close();
        
    }

}
