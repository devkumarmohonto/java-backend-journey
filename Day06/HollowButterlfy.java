package Day06;

public class HollowButterlfy {
    
    public static void main(String[] args) {
        int n = 5;

        // Upper part 
        for(int i=1; i<=n; i++) {

            // Star 
            for(int j=1; j<=i; j++) {
                
                if(j == 1 || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            
            // Space 
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // Star 
            for(int j=1; j<=i; j++) {
                
                if(j == 1 || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower part 
        for(int i=n; i>=1; i--) {

            // Star 
            for(int j=1; j<=i; j++) {
                
                if(j == 1 || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            
            // Space 
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // Star 
            for(int j=1; j<=i; j++) {
                
                if(j == 1 || j == i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
