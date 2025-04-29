package src;
import java.util.Scanner;
public class Customer {

    static  Scanner input= new Scanner(System.in);
   
    public static void main(String[] arg) {
        System.out.println("Enter the number of customers:");
        int size; 
        size = input.nextInt();
        int[] customerId = new int[size];
        fillArray(customerId);
        printArray(customerId);
        System.out.println("Enter the customer ID to search:");
        int target = input.nextInt();
        searchArray(customerId, target);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the customer ID:");
            array[i] = input.nextInt();
        }
    }

    public static void printArray( int [] array ){
        for ( int i =0 ; i<array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public static void searchArray(int [] array , int target){
        for ( int i=0 ; i<array.length; i++){
            if ( array[i]==target){
                System.out.println(array[i]);

            } else {
                System.out.println("Not found");
            }
        }
    }
}