package example2;

public class TestPerson {

    static void main(String[] args) {
        Person p1 = new Person("Jan", 20);
        Person p2 = new Person("Jan", 20);
        System.out.println(p1.equals(p2));
        Employee e1 = new Employee("Jan", 20, "IT");
        Employee e2 = new Employee("Jan", 20, "IT");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(p1));
        System.out.println(p1.equals(e1));
    }
}
