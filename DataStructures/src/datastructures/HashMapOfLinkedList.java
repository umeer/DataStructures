package datastructures;

import java.util.HashMap;

/**
 * This class is just a testing class to study the HashMap of LinkedList (no
 * concurrency)
 *
 */
public class HashMapOfLinkedList {

    HashMap<String, java.util.LinkedList<String>> map;

    public HashMapOfLinkedList() {
        map = new HashMap<String, java.util.LinkedList<String>>();
    }

    public void add(String key, String element) {
        java.util.LinkedList<String> list;
        if (map.containsKey(key)) {
            list = map.get(key);
            list.add(element);
            map.put(key, list);
        } else {
            list = new java.util.LinkedList<String>();
            list.add(element);
            map.put(key, list);
        }
    }

    public java.util.LinkedList<String> retrive(String key) {
        return map.get(key);
    }
}
