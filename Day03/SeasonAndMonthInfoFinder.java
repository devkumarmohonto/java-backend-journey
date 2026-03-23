package Day03;

import java.util.Scanner;

public class SeasonAndMonthInfoFinder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter Month Number: ");
        int month = sc.nextInt();

        //Month
        switch (month) {
            case 1:
                System.out.println("Month: January");
                break;
            case 2:
                System.out.println("Month: February");
                break;
            case 3:
                System.out.println("Month: March");
                break;
            case 4:
                System.out.println("Month: April");
                break;
            case 5:
                System.out.println("Month: May");
                break;
            case 6:
                System.out.println("Month: June");
                break;
            case 7:
                System.out.println("Month: July");
                break;
            case 8:
                System.out.println("Month: Auguest");
                break;
            case 9:
                System.out.println("Month: September");
                break;
            case 10:
                System.out.println("Month: October");
                break;
            case 11:
                System.out.println("Month: November");
                break;
            case 12:
                System.out.println("Month: December");
                break;
            default:
                System.out.println("Invalid Number");
        }

        //if (month == 12 || month== 1 || month == 2) {
        //   System.out.print("Season: Winter");
        //}
        //else if (month == 3 ||  month == 4 || month == 5) {
        //    System.out.print("Season: Spring");
        //}
        //else if (month == 6 || month == 7 || month == 8) {
        //    System.out.print("Season: Summer");
        //}
        //else {
        //    System.out.print("Season: Autumn");
        //}

        //Season
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Season: Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season: Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season: Summer");
                break;
            default:
                System.out.println("Season: Autumn");
        }

        //Days
        switch (month) {
            case 2:
                System.out.println("Days: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Days: 30");
                break;
            default:
                System.out.println("Days: 31");
        }

        //if (month == 2) {
        //    System.out.print("Days: 28");
        //}
        //else if (month == 4 || month == 6 || month == 9 || month == 11) {
        //    System.out.print("Days: 30");
        //}
        //else {
        //    System.out.print("Days: 31");
        //}

        sc.close();
    }
}
