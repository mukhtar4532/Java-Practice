import java.util.*;
public class Loops_Practice {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    /*
    int n = sc.nextInt();
    print reverse of no. 
    int lastDigit = 0 ;

     while(n>0){
        lastDigit = n%10;
         System.out.print(lastDigit);
         n = n/10 ;
     }

    for(int i=0; i<3; i++){
        lastDigit = n%10;
         System.out.print(lastDigit);
         n = n/10 ;
    }

    int rev = 0;
    for(int i=0; i<4; i++){
        lastDigit = n%10 ;
        rev = (rev*10) + lastDigit ;
        n = n/10 ;
    }

    while (n>0) {
        lastDigit = n%10 ;
        rev = (rev*10) + lastDigit ;
        n = n/10 ;
    }
    System.out.println("It is a reverse of a no." + rev);
    */

    /*  Check a no. is Prime or not 
    System.out.println("Enter a no. you want to check it is prime or not ");
    int n = sc.nextInt();
    if(n==1){
            System.out.println("The no. you entered is not prime");
        }
        else if(n==2){
            System.out.println("The no. you entered is prime ");
        }else{
            boolean isPrime = true;
             for(int i=2; i<=n-1; i++){
            
                if (n%i == 0) {
                    isPrime = false;
                 }
            }
          if (isPrime==true) {
            System.out.println("The no. you entered is prime");    
            }else{
                System.out.println("The no. you entered is not prime");
            }
            }
     */

     /*  To print sum of first n even numbers using while loop.
     System.out.println("Enter the no. ");
     int n = sc.nextInt();
     int i = 1;
     int sum = 0;
     while (i<=n) {
        if (i%2==0) {
            sum += i;
        }
        i++;
     }
     System.out.println("The sum of even no. is "+ sum);
     */
    
    /*  Factorial using while loop
     System.out.println("Enter the no. you want to print the factorial of the no. ");
     int n = sc.nextInt();
     int i = 1 ;
     int fact = 1;
     while (i<=n) {
        fact *= i ;
        i++;
    }
    System.out.println("The factorial of no. is " + fact);
    */

     
     sc.close();
}
    
}