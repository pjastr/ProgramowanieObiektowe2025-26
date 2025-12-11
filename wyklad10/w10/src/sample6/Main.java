package sample6;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        ArrayList<Vehicle> a1 = new ArrayList<>();
        a1.add(new Car());
        a1.add(new Bike());
        a1.add(new Car());
        a1.add(new Car());
        for (Vehicle elem : a1){
            elem.move();
        }
    }
}

interface Vehicle {
    void move();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Samochód jedzie");
    }
}

class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Rower jedzie");
    }
}
