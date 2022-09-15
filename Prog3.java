// Write a Java program to compute quotient and remainder and
// print it.

import java.util.*;
public class Prog3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend: ");
        int dividend = sc.nextInt(); 
        System.out.println("Enter the Divisor: ");
        int divisor = sc.nextInt(); 
        if(divisor == 0){
            System.out.println("Divisor cannot be zero");
            return;
        }

        int quotient = (int)dividend/divisor;
        int remainder = dividend - (quotient * divisor);

        System.out.println("The Quotient is: " + quotient);
        System.out.println("The remainder is " + remainder);


    }
}
