package example24b;

public class Test24b {

    public static void main(String[] args) {
        EqualBox box = new EqualBox();
        System.out.println(box.isEqual(1, 1));
        System.out.println(box.isEqual("Hello", "World"));
        System.out.println(box.isEqual(1.2, 1.2));
    }

    public static boolean isEqualInt(int a, int b) {
        return a == b;
    }

    public static boolean isEqualInteger(Integer a, Integer b) {
        return a.equals(b);
    }


}
