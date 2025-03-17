package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(int key, int value) {
        KeyValuePair pair = new KeyValuePair(key, value);
        Node newNode = new Node(pair);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Node findNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.getPair().getKey() == key) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean removeNode(int key) {
        if (head == null) {
            return false;
        }

        if (head.getPair().getKey() == key) {
            head = head.getNext();
            return true;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getPair().getKey() == key) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public String toString() {
        return head != null ? head.toString() : "Empty List";
    }
}