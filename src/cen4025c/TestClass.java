package cen4025c;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class TestClass {

    public static void main(String[] args) {
        // ArrayList
        long startTime = System.nanoTime();
        fillAndDeleteArray();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.printf("ArrayList ET: %,d %n", elapsedTime);

        // LinkedList
        startTime = System.nanoTime();
        fillAndDeleteLinkedList();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.printf("LinkedList ET: %,d %n", elapsedTime);

        // Hashtable
        startTime = System.nanoTime();
        fillAndDeleteHashtable();
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.printf("Hashtable ET:  %,d %n", elapsedTime);
    }

    private static void fillAndDeleteArray() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        integerArrayList.removeAll(integerArrayList);
    }

    private static void fillAndDeleteLinkedList() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        integerLinkedList.removeAll(integerLinkedList);
    }

    private static void fillAndDeleteHashtable() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashTable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashTable.put(i, random.nextInt(9999));
        }
        for (int i = 0; i < integerHashTable.size(); i++) {
            integerHashTable.remove(i);
        }
    }

}
