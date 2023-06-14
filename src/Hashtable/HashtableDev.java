package Hashtable;

public class HashtableDev {
    private final String[] keys;
    private final String[] values;
    private final int size;

    HashtableDev(int size) {
        this.size = size;
        keys = new String[10];
        values = new String[10];
    }

    private int generateHash(String key) {
        return Math.abs(key.hashCode() % this.size);
    }

    public void add(String key, String value) {
        int index = this.generateHash(key);
        if (keys[index] == null && values[index] == null) {
            this.keys[index] = key;
            this.values[index] = value;
        }
    }

    public String search(String key) {
        int index = this.generateHash(key);
        if (keys[index] != null && values[index] != null) {
            if (key.equals(keys[index])) return "(" + index + ", " + keys[index] + ", " + values[index] + ")";
        }
        return "Não encontrado";
    }

    public String remove(String key) {
        int index = this.generateHash(key);
        if (keys[index] != null && values[index] != null) {
            if (key.equals(keys[index])) {
                keys[index] = null;
                values[index] = null;
                return "Index " + index + " removido";
            }
        }
        return "Não encontrado";
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        int length = Math.min(keys.length, values.length);
        for (int i = 0; i < length; i++) {
            if (keys[i] != null && values[i] != null) {
                String line = "(" + i + ", " + keys[i] + ", " + values[i] + ")";
                message.append(line);
            }
        }
        return message.toString();
    }
}
