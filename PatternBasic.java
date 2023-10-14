import java.util.*;

public class PatternBasic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*  Right angle triangle pattern printing
        System.out.println("Enter the no. of rows ");
        int n = sc. nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Inverted Right angle triangle pattern printing
        System.out.println("Enter the no. of rows ");
        int n = sc. nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*  Character pattern printing.
        System.out.println("Enter no. of rows ");
        int n = sc.nextInt();
        char ch = 'A' ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++ ;
            }
            System.out.println();
        }
        */

        
        sc.close();
    }
}
