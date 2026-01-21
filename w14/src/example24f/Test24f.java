package example24f;

import java.util.function.Predicate;

public class Test24f {

    static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;

        boolean result = isPositive.test(5);  // true
        boolean result2 = isPositive.test(-3); // false
        System.out.println(result);
        System.out.println(result2);
    }
}
