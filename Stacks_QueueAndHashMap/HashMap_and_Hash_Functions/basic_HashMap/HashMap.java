package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

public class HashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList[] buckets;
    private int size;

    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity) {
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList();
        }
        this.size = 0;
    }

    private int hash(int key) {
        return key % buckets.length;
    }

    public void put(int key, int value) {
        int index = hash(key);
        LinkedList list = buckets[index];
        Node node = list.findNode(key);

        if (node != null) {
            node.getPair().setValue(value);
        } else {
            list.addNode(key, value);
            size++;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        LinkedList list = buckets[index];
        Node node = list.findNode(key);

        return node != null ? node.getPair().getValue() : null;
    }

    public boolean remove(int key) {
        int index = hash(key);
        LinkedList list = buckets[index];
        boolean removed = list.removeNode(key);

        if (removed) {
            size--;
        }

        return removed;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < buckets.length; i++) {
            sb.append("Bucket ").append(i).append(": ").append(buckets[i].toString()).append("\n");
        }
        return sb.toString();
    }
}