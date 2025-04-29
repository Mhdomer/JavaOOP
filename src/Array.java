package src;

public class Array {

 public static void main ( String []arg ){

    int [] numbers= {1,2,3,4,5};
    

    // access using index 

    System.out.println("Elemenet of numbers array at index 0:"+ numbers[0]);
    System.out.println("Elemenet of numbers array at index 0:"+ numbers[0]);

    // modifying elemnts in the array 


    numbers[1]= 10; 
    System.out.println("modification of element at index 1 :"+ numbers[1]);


    // iterating 

    System.out.println("Printing all elemnets of the array:");
    int index1= 0;
     for (int num : numbers) {
    System.out.println("Element at index " + index1+ ": " + num);
    index1++;
}

    int [] uinitalizedArray= new int [3];

    uinitalizedArray[0]=100;
    uinitalizedArray[1]=200;
    uinitalizedArray[2]=300; 



    int[] initalizedArray= new int [uinitalizedArray.length];

    int index=0; 

    for(int element : uinitalizedArray){
        initalizedArray[index] = element; 
        index++; 
    }

    System.out.println("Prinitng initialized array using enhance for loop : ");

    for( int element : initalizedArray){

        System.out.println("elemnt:" + element);
    }





























   































 }










































































}
