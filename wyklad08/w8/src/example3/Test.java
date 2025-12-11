package example3;

public class Test {

    static void main(String[] args) {
        double a = 1.2;
        double b = 1.1+0.1;
        System.out.println(a == b);
        System.out.println(Double.compare(a, b)==0);
    }
}
