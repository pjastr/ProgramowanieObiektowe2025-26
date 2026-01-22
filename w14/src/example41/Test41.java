package example41;

import java.util.*;
import java.util.function.Predicate;



public class Test41 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anna", 6000.0));
        employees.add(new Employee("Jan", 4500.0));
        employees.add(new Employee("Piotr", 7500.0));
        employees.add(new Employee("Maria", 3500.0));
        employees.add(new Employee("Tomasz", 5500.0));

        System.out.println("Przed filtrowaniem: " + employees);

        Predicate<Employee> highSalary = e -> e.getSalary() > 5000;
        filterCollection(employees, highSalary);

        System.out.println("Po filtrowaniu (salary > 5000): " + employees);
    }
    
    public static <E> void filterCollection(ArrayList<E> items, Predicate<E> condition) {
        ArrayList<E> toRemove = new ArrayList<>();
        for (E item : items) {
            if (!condition.test(item)) {
                toRemove.add(item);
            }
        }
        items.removeAll(toRemove);
    }


}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}