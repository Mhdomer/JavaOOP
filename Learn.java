
import java.util.Scanner;

public class Learn {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double salary1, s2;

            System.out.println("Enter your salary: ");
            salary1 = input.nextDouble();

            System.out.println("Your salary is: " + salary1);
            
            // Array in Java example
            // Uncomment and complete the code below to work with arrays
            /*
            int[] numbers = new int[5]; // Creating an array of size 5
            
            // Filling the array
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Enter number " + (i+1) + ":");
                numbers[i] = input.nextInt();
            }
            
            // Displaying the array
            System.out.println("The numbers you entered are:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            */
        }
    }
}
