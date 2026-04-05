package Day05;

public class SolidRectanglePattern {

    public static void main(String[] args) {

        // 1st Way
        //for (int i=1; i<=4; i++) {
        //    System.out.print("*");
        //    System.out.print("*");
        //    System.out.print("*");
        //    System.out.println("*");
        //}

        // 2nd Way
        //for (int i=1; i<=4; i++) {
        //    System.out.println("*****");
        //}

        // 3rd Way
        for (int i=1; i<=4; i++) { //For Row
            for (int j=1; j<=5; j++) { //For Collum
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
