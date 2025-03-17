package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

public class KeyValuePair {
    private int key;
    private int value;

    public KeyValuePair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key + "=" + value + "}";
    }
}