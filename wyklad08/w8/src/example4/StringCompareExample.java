package example4;

public class StringCompareExample {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = null;

        // Porównywanie za pomocą ==
        System.out.println("Porównanie za pomocą == : " + (str1 == str2)); // Zwróci false
        System.out.println("Porównanie referencji : " + (str3 == "Hello")); // Zwróci true

        // Porównywanie za pomocą equals
        System.out.println("Porównanie za pomocą equals : " + str1.equals(str2)); // Zwróci true

        // Porównywanie ignorując wielkość liter
        System.out.println("Porównanie za pomocą equalsIgnoreCase : " + str1.equalsIgnoreCase("hello")); // Zwróci true

        // Bezpieczne porównywanie za pomocą Object.equals
        System.out.println("Bezpieczne porównanie : " + java.util.Objects.equals(str1, str4)); // Zwróci false
    }
}