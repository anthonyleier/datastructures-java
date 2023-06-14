package Stack;

import java.util.ArrayList;

public class Stack {
    private final ArrayList<Integer> values = new ArrayList<>();

    Stack(int value){
        values.add(value);
    }

    public void add(int value) {
        values.add(value);
    }

    public int remove(){
        return values.remove(values.size()-1);
    }

    @Override
    public String toString() {
        return values.toString();
    }
}
