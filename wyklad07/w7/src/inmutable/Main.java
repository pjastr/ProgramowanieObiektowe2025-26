package inmutable;

import java.util.ArrayList;

public class Main {

    static void main(String[] args) {
        ArrayList<String> aaa = new ArrayList<>();
        aaa.add("AA");
        aaa.add("rr");
        MyImmutableClass m1 = new MyImmutableClass(34, "PP", aaa);
        aaa.add("rgkjfdj");
        ArrayList<String> qqq = m1.getItems();
        qqq.add("gjfdbhkjg");
    }
}
