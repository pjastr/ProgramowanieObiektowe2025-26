package shapes;

import java.util.ArrayList;

public class TestShape {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape());
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        for (var shape : shapes) {
            shape.draw(); // Wywołanie metody draw() odpowiedniej klasy
        }
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}