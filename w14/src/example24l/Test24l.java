package example24l;

import java.util.function.Predicate;

public class Test24l {

    static void main(String[] args) {
        Predicate<Integer> inRange = ((Predicate<Integer>) n -> n >= 0)
                .and(n -> n <= 100);

        Predicate<Integer> outOfRange = inRange.negate();

        boolean result1 = inRange.test(50);     // true
        boolean result2 = outOfRange.test(150); // true
        System.out.println(result1);
        System.out.println(result2);
    }
}
