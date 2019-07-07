package datastructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * This class is just a testing class to study the HashMap of LinkedList (no
 * concurrency)
 *
 */
public class HashMapOfLinkedList {

    HashMap<String, java.util.LinkedList<String>> map;

    public HashMapOfLinkedList() {
        map = new HashMap<String, LinkedList<String>>();
    }

    public void add(String key, String element) {
        java.util.LinkedList<String> list;
        if (map.containsKey(key)) {
            list = map.get(key);
            list.add(element);
            map.put(key, list);
        } else {
            list = new LinkedList<String>();
            list.add(element);
            map.put(key, list);
        }
    }

    public java.util.LinkedList<String> retrive(String key) {
        return map.get(key);
    }

    public String toStringHashMap() {
        String output = "";
        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()) {
            output = (output.length() == 0) ? output + entry.getKey() : output + " " + entry.getKey();
        }
        return output;
    }
}
