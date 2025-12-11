package example1;

public class TestPerson {

    static void main(String[] args) {
        Person p1 = new Person("Jan", 20);
        Person p2 = new Person("Jan", 20);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(null));
        //System.out.println(null.equals(p1));
    }
}
