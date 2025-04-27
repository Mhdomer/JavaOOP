package src;



public class CalculatorApp {

    public static void main (String[] args ){

        int num1 = 20 ; 
        int num2 = 8; 







        int sum = Calculator.add(num1, num2);
        int difference=Calculator.subtract(num2, sum);


        System.out.println("Sum" + sum);
        System.out.println("Difference" + difference);



    }
}
