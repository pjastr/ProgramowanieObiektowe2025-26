package example24o;

import java.util.function.Predicate;

public class Test24o {

    static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, 9, 8};
        System.out.println(allMatch(numbers, n -> n % 2 == 0, n -> n > 0));
        Integer[] numbers2 = {6, 12, 34, 90, 8};
        System.out.println(allMatch(numbers2, n -> n % 2 == 0, n -> n > 5));
        String[] strings = {"one", "two", "three", "four"};
        System.out.println(allMatch(strings, s -> s.startsWith("t"), s -> s.length() > 3));
    }

    public static <T> boolean allMatch(T[] array,
                                       Predicate<T> first,
                                       Predicate<T> second) {
        Predicate<T> combined = first.and(second);
        for (T element : array) {
            if (!combined.test(element)) {
                return false;
            }
        }
        return true;
    }
}
