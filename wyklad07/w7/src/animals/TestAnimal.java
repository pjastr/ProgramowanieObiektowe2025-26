package animals;

public class TestAnimal {

    static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        myDog.makeSound(); // Wywoła "Rex barks."
        myDog.eat();       // Wywoła "Rex is eating."
    }
}
