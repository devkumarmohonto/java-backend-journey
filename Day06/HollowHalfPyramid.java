package Day06;

public class HollowHalfPyramid {
    
    public static void main(String[] args) {
        int n = 6;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                // Condition
                if(j == 1 || j == i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        
    }
}
