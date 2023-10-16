import java.util.*;

public class PatternAdvance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

      /*  Hollow Rectangle pattern.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        */

        /*  Rotated Half-Pyramid.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                // spaces
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                // stars
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Inverted & Rotated Half - Pyramid.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= (n-i); j++) {
                // spaces
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                // stars
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Rotated Half-Pyramid with number.
         System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                // spaces
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                // stars
                System.out.print( " " + k + " ");
            }
            System.out.println();
        }
        */

        /*  Inverted & Rotated Half-Pyramid with number.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            // spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            // numbers
            for (int k = 1; k <= i; k++) {
                System.out.print( " " + k + " ");
            }
            System.out.println();
        }
        */

        /*  Inverted Half-Pyramid with number.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i+1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        /*  Floyd's Triangle. (Changing the outer loop we made a code for rotated or inverted and rotated.)
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( " " + count + " ");
                count++ ;
            }
            System.out.println();
        }
        */

        /*  0-1 Triangle.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2 == 0) {
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
        */

        /*  Butterfly Pattern.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();   
        // Upper part.
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // spaces
            for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print("   ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
            // Lower Part.
        for (int i = n; i >= 0; i--) {
            // stars
                 for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // spaces
                for (int k = 1; k <= 2*(n-i); k++) {
                System.out.print("   ");
            }
            // stars
                 for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Solid Rhombus
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Hollow Rhombus
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==1 || i==n || j==n) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        */

        /*  Diamond Pattern
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        // Uppar Part
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // Lower Part
        for (int i = n; i >= 0; i--) {
            //space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            //star
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /* Number Pyramid
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            // star
            // for (int j = 1; j <= (2*i-1); j++) {
                // System.out.print(" " + count + " ");
                for (int k = 1; k <= i; k++) {
                    System.out.print("   " + count + "   "); 
                }
            // }
            count++ ;
            System.out.println();
        }
        */ 
        
        // Palendrome Like Pattern
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            int count = 1;
            for (int j = 1; j <= (2*i-1); j++) {
                while (count>1) {
                    System.out.print(count);
                    count--;
                }
                while (count == 1 || count <= i) {
                    count++;
                    System.out.print(count);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
