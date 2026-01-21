package example24j;

import java.util.function.Predicate;

public class Test24j {

    static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> isNotEmpty = isEmpty.negate();

        boolean result1 = isNotEmpty.test("");      // false
        boolean result2 = isNotEmpty.test("Hello"); // true
        System.out.println(result1);
        System.out.println(result2);
    }
}
