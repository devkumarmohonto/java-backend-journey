package Day06;

public class HollowFullPyramid {
    
    public static void main(String[] args) {
        int n = 7;

        for(int i=1; i<=n; i++) {
            
            // Spaces 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Star 
            for(int j=1; j<=2*i-1; j++) {
                
                if(j == 1 || j == 2*i-1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
