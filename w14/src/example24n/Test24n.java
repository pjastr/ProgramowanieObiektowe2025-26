package example24n;

import java.util.function.Predicate;

public class Test24n {

    static void main(String[] args) {
        Integer[] numbers = {1, -2, 3, 9, 8};
        System.out.println(countMatching(numbers, n -> n % 2 == 0));
        String[] strings = {"one", "two", "three", "four"};
        System.out.println(countMatching(strings, s -> s.contains("o")));
    }

    public static <T> int countMatching(T[] array, Predicate<T> condition) {
        int count = 0;
        for (T element : array) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }
}
