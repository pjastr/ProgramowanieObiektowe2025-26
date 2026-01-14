package example24c;

public class TestCounter {

    public static void main(String[] args) {
        Counter<Integer> counter = new Counter<>();
        counter.addElement(1);
        counter.addElement(2);
        counter.addElement(3);
        System.out.println("Counter: " + counter.getCount());

        Counter<String> counter2 = new Counter<>();
        counter2.addElement("A");
        counter2.addElement("B");
        counter2.addElement("C");
        System.out.println("Counter2: " + counter2.getCount());
    }
}
