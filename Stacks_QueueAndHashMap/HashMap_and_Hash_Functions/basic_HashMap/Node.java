package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

public class Node {
    private KeyValuePair pair;
    private Node next;

    public Node(KeyValuePair pair) {
        this.pair = pair;
        this.next = null;
    }

    public KeyValuePair getPair() {
        return pair;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return pair.toString() + (next != null ? " -> " + next : "");
    }
}