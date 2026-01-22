package example43;

import java.util.*;
import java.util.function.Predicate;



public class Test43 {


    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Anna", 25));
        people.add(new Person("Adam", 17));
        people.add(new Person("Barbara", 30));
        people.add(new Person("Aleksander", 45));
        people.add(new Person("Piotr", 22));
        people.add(new Person("Alicja", 15));

        Predicate<Person> isAdult = p -> p.getAge() >= 18;
        Predicate<Person> nameStartsWithA = p -> p.getName().startsWith("A");

        ArrayList<Person> matching = findAllMatching(people, isAdult, nameStartsWithA);

        System.out.println("Osoby pełnoletnie z imieniem na A: " + matching);
    }

    public static <E> ArrayList<E> findAllMatching(TreeSet<E> set,
                                                   Predicate<E> condition1, Predicate<E> condition2) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : set) {
            if (condition1.test(item) && condition2.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}