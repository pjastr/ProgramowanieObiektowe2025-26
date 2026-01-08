package example24e;

public class Test24e {

    public static void main(String[] args) {
        int[] numbers = {1, -2, 32, -4, 5};
        System.out.println(maxValueInt(numbers));
        Vehicle[] vehicles = {
            new Vehicle("Toyota", 380),
            new Vehicle("Ford", 200),
            new Vehicle("Chevrolet", 190),
            new Vehicle("Toyota", 200)
        };
        System.out.println(maxValue(vehicles));
    }

    public static int maxValueInt(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public  static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
