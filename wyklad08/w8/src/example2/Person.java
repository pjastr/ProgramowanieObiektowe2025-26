package example2;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Sprawdzenie, czy obiekty są tym samym obiektem
        if (this == obj) return true;

        // Sprawdzenie, czy obj nie jest null i czy jest typu Person
        if (obj == null || getClass() != obj.getClass()) return false;

        // Rzutowanie obj do typu Person
        Person person = (Person) obj;

        // Porównanie pól
        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // Gettery, settery, hashCode(), toString() itp.

    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}