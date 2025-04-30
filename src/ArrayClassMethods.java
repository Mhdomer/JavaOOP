package src;

import java.util.Arrays;

public class ArrayClassMethods {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 7, 2};

        // Sort and search
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Value 30 found at index " + index);

        // Compare arrays
        int[] array1 = {10, 10, 10, 10, 10};
        int[] array2 = new int[5];
        Arrays.fill(array2, 10);
        System.out.println("Arrays array1 and array2 are equal: " + Arrays.equals(array1, array2));

        // Fill
        System.out.println("Filled array: " + Arrays.toString(array2));

        // Sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Partial sort
        int[] partial = {5, 1, 7, 2, 3};
        Arrays.sort(partial, 1, 4); // sort index 1 to 3
        System.out.println("Partially sorted array: " + Arrays.toString(partial));
    }
}
