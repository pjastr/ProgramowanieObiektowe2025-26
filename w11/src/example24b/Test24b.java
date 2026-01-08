package example24b;

public class Test24b {

    public static void main(String[] args) {
        System.out.println(isEqual(1, 1));
        System.out.println(isEqual("Hello", "World"));
        System.out.println(isEqual(1.2, 1.2));
    }

    public static boolean isEqualInt(int a, int b) {
        return a == b;
    }

    public static boolean isEqualInteger(Integer a, Integer b) {
        return a.equals(b);
    }

    public static <T> boolean isEqual(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
}
