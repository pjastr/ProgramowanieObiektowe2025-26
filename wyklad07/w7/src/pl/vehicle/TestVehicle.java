package pl.vehicle;

public class TestVehicle {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);

        myCar.displayBrand();  // Dziedziczone z klasy Vehicle
        myCar.displayDoors();  // Specyficzne dla klasy Car
        myCar.drive();         // Przesłonięta z klasy Vehicle
    }
}