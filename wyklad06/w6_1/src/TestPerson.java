public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Doe");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}