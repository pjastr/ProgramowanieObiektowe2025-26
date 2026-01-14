package example24m;

import java.util.function.Predicate;

public class Test24m {

    static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, 9, 5};
        System.out.println(findFirst(numbers, n -> n > 3));
        String[] strings = {"one", "two", "three"};
        System.out.println(findFirst(strings, s -> s.startsWith("t")));
    }

    public static <T> T findFirst(T[] array, Predicate<T> condition) {
        for (T element : array) {
            if (condition.test(element)) {
                return element;
            }
        }
        return null;
    }
}
