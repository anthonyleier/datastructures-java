package Queue;

import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> values = new ArrayList<>();

    Queue(int value){
        values.add(value);
    }

    public void add(int value) {
        values.add(value);
    }

    public int remove(){
        return values.remove(0);
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
