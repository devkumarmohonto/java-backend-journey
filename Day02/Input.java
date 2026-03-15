package Day02;

import java.util.Scanner;
public class Input {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        //String name = sc.next();
        String name = sc.nextLine();
        int number = sc.nextInt();
        double hight = sc.nextDouble();
       

        System.out.println(name);
        System.out.println(number);
        System.out.println(hight);
       
        sc.close();
        
    }
}
