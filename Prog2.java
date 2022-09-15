// Write a Java program to print multiplication of two floating
// point numbers.
import java.util.*;
public class Prog2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers of type float: ");
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();

        System.out.println("The multiplication of two numbers is: " + (number1 * number2));

    }
}
