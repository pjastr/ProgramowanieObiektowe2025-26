import education.University;

public class TestSchool {

    static void main(String[] args) {
        University u1 = new University("AA", "BB", 100, "XX", 5);
        System.out.println(u1);
        System.out.println(u1.equals(u1));
        System.out.println(u1.hashCode());
        u1.recruitment(300);
    }
}
