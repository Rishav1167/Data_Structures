package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(17, 170); // This will collide with key 1 in a default capacity of 16
        map.put(22, 172);

        System.out.println(map);

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 17: " + map.get(17));

//        map.remove(2);
//        System.out.println("After removing key 2:");
//        System.out.println(map);
    }
}
