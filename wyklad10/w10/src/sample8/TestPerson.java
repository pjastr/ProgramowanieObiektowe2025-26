package sample8;

import java.util.Arrays;

public class TestPerson {

    static void main(String[] args) {
        Person[] people = { new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35) };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
