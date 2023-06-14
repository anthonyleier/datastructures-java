package Stack;

import java.util.ArrayList;

public class StackDev {
    private final ArrayList<Integer> values = new ArrayList<>();

    public void add(int value) {
        values.add(value);
    }

    public int remove() {
        if (this.notEmpty()) return values.remove(values.size() - 1);
        return -1;
    }

    public int peek() {
        if (this.notEmpty()) return values.get(values.size() - 1);
        return -1;
    }

    public boolean notEmpty() {
        return !this.values.isEmpty();
    }

    public int size() {
        return values.size();
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
