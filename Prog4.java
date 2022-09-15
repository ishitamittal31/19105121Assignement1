// Write a Java program to swap the values of integer number
// with using temporary variable and without using temporary
// variable

import java.util.*;
public class Prog4 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers to swap without variable: ");
        int number1 = sc.nextInt();//6
        int number2 = sc.nextInt();//4
        int temp;
        temp = number1 - number2;//2
        number1 = number1 - temp;
        number2 = number2 + temp;
        System.out.println("The first number is: " + number1);
        System.out.println("The second number is: " + number2);
        System.out.println("Enter the two numbers to swap with variable: ");
        int num1 = sc.nextInt();//6
        int num2 = sc.nextInt();//4
        int temporary;
        temporary = num1;
        num1 = num2;
        num2 = temporary;
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);



    
    }
}
