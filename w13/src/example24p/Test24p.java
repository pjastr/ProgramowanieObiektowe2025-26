package example24p;

import java.util.function.Predicate;

public class Test24p {

    static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, 9, 8};
        System.out.println(containsValue(numbers, 3));
        String[] strings = {"one", "two", "three", "four"};
        System.out.println(containsValue(strings, "two"));
    }

    public static <T> boolean containsValue(T[] array, T value) {
        Predicate<T> isEqual = Predicate.isEqual(value);
        for (T element : array) {
            if (isEqual.test(element)) {
                return true;
            }
        }
        return false;
    }
}
