package example24h;

import java.util.function.Predicate;

public class Test24h {
    static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<Integer> isPositiveAndEven = isPositive.and(isEven);

        boolean result1 = isPositiveAndEven.test(4);  // true
        boolean result2 = isPositiveAndEven.test(-4); // false
        boolean result3 = isPositiveAndEven.test(3);  // false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
