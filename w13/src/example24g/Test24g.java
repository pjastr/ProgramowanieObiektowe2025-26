package example24g;

import java.util.function.Predicate;

public class Test24g {

    static void main(String[] args) {
        Predicate<String> isLong = s -> s.length() > 5;

        boolean result1 = isLong.test("Java");        // false
        boolean result2 = isLong.test("Programming"); // true
        System.out.println(result1);
        System.out.println(result2);
    }
}
