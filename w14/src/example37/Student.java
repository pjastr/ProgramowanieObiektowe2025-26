package example37;


import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;

    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public int compareTo(Student o) {
        int base = this.name.compareTo(o.name);
        if (base !=0)
            return base;
        return Double.compare(this.grade, o.grade);
    }
}
