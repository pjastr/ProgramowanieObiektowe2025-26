package example24d;

import java.util.Arrays;

public class Test24d {

    public static void main(String[] args) {
        Integer[] intArray = {1, 48, 33, -2, 5};
        System.out.println("Before swap:");
        System.out.println(Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap:");
        System.out.println(Arrays.toString(intArray));
        String[] strArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Before swap:");
        System.out.println(Arrays.toString(strArray));
        swap(strArray, 0, 3);
        System.out.println("After swap:");
        System.out.println(Arrays.toString(strArray));
    }

    public static <T> void swap(T[] array, int i, int j) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        if(i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
