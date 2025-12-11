package animals;

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Wywołanie konstruktora klasy bazowej
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}
