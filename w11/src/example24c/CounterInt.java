package example24c;

import java.util.ArrayList;

public class CounterInt {

    private ArrayList<Integer> elements;

    public CounterInt() {
        elements = new ArrayList<>();
    }

    public void addElement(int element) {
        elements.add(element);
    }

    public int getCount() {
        return elements.size();
    }
}
