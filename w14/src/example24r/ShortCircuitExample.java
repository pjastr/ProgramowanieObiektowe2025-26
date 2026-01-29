package example24r;

import java.util.function.Predicate;

public class ShortCircuitExample {
    public static void main(String[] args) {

        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isLong = s -> s.length() > 5;  // RZUCI NullPointerException dla null!

        // Test 1: Bezpieczna kolejność - skrócona ewaluacja chroni przed błędem
        System.out.println("=== Bezpieczna kolejność (isNotNull.and) ===");
        Predicate<String> safe = isNotNull.and(isLong);
        System.out.println(safe.test(null));  // false - drugi predykat NIE jest wywoływany
        System.out.println(safe.test("Abc"));  // false - oba są wywoływane
        System.out.println(safe.test("Długi tekst"));  // true - oba są wywoływane

        // Test 2: Niebezpieczna kolejność - brak skróconej ewaluacji = BŁĄD!
        System.out.println("\n=== Niebezpieczna kolejność (isLong.and) ===");
        Predicate<String> unsafe = isLong.and(isNotNull);
        try {
            System.out.println(unsafe.test(null));  // CRASH! NullPointerException
        } catch (NullPointerException e) {
            System.out.println("BŁĄD: " + e.getClass().getSimpleName());
        }

        // Test 3: or() też ma skróconą ewaluację
        System.out.println("\n=== Test OR ===");
        Predicate<String> either = isNotNull.or(isLong);

        System.out.println(either.test("cokolwiek"));  // true - drugi NIE jest wywoływany!
        try{
            System.out.println(either.test(null));
        }
        catch (NullPointerException e){
            System.out.println("BŁĄD: " + e.getClass().getSimpleName());
        }
    }
}