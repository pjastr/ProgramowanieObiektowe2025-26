package example24k;

import java.util.function.Predicate;

public class Test24k {

    static void main(String[] args) {
        Predicate<String> isHello = Predicate.isEqual("Hello");

        boolean result1 = isHello.test("Hello"); // true
        boolean result2 = isHello.test("World"); // false
        boolean result3 = isHello.test(null);    // false

        Predicate<String> isNull = Predicate.isEqual(null);
        boolean result4 = isNull.test(null);     // true
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
