package animals;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Metoda abstrakcyjna
    public abstract void makeSound();

    // Metoda nieabstrakcyjna
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Getter dla name
    public String getName() {
        return name;
    }
}
