package sample5;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.drive(); // Wywołanie metody abstrakcyjnej
        car.turnOnLights(); // Wywołanie metody domyślnej

        Vehicle.horn(); // Wywołanie metody statycznej interfejsu
    }
}


interface Vehicle {

    // Metoda abstrakcyjna
    void drive();

    // Metoda domyślna
    default void turnOnLights() {
        System.out.println("Światła włączone.");
    }

    // Metoda statyczna
    static void horn() {
        System.out.println("Trąbienie!");
    }
}


class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Samochód jedzie.");
    }
}