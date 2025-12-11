package example1;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        System.out.println(person);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        Person person2 = new Person("Alice", 30);
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        Employee employee = new Employee("Bob", 101);
        System.out.println(employee.employeeInfo());
    }
}
