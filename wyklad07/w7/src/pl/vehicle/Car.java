package pl.vehicle;

class Car extends Vehicle {
    private int numberOfDoors;

    // Konstruktor
    public Car(String brand, int numberOfDoors) {
         // Wywołanie konstruktora klasy bazowej
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    // Metoda do wyświetlania liczby drzwi
    public void displayDoors() {
        System.out.println("Number of doors: " + numberOfDoors);
    }

    // Nadpisanie metody drive
    @Override
    public void drive() {
        System.out.println("The car is driving smoothly.");
    }
}