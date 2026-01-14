package example24a;

public class TestBox {

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>(44);
        System.out.println(box1.get());
        box1.set(Integer.valueOf(20));
        System.out.println(box1.get());
        Box<String> box2 = new Box<>("Hello");
        System.out.println(box2.get());
        box2.set("World");
        System.out.println(box2.get());
    }
}
