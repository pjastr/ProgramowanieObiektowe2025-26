package example24c;

import java.util.ArrayList;

public class Counter <T>{

    private ArrayList<T> elements;

    public Counter() {
        elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public int getCount() {
        return elements.size();
    }
}
