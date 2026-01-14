package example24i;

import java.util.function.Predicate;

public class Test24i {

    static void main(String[] args) {
        Predicate<Integer> isNegative = n -> n < 0;
        Predicate<Integer> isGreaterThan100 = n -> n > 100;

        Predicate<Integer> isExtreme = isNegative.or(isGreaterThan100);

        boolean result1 = isExtreme.test(-5);  // true
        boolean result2 = isExtreme.test(150); // true
        boolean result3 = isExtreme.test(50);  // false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
