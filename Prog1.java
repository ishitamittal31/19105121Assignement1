//Write a Java program to print addition and subtraction of two
//integer numbers.

import java.util.*;
public class Prog1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int add = number1 + number2;
        int sub = number1 - number2;
        System.out.println("Addition of two numbers is " + add);
        System.out.println("Subtraction of two numbers is " + sub);
        sc.close();

    }
}
