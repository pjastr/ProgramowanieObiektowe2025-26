//klasa testująca
public class TestVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}
// Klasa bazowa
class Vehicle {
    public void display() {
        System.out.println("To jest pojazd.");
    }

    @Override
    public String toString() {
        return "Vehicle{}";
    }


}

// Klasa pochodna
class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("To jest samochód.");
        super.display();  // Wywołanie metody z klasy bazowej

    }
}