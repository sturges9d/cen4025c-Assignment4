package cen4025c;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class TestClass {

    public static void main(String[] args) {

        // Loop through methods 100 times.
        for (int i = 0; i < 100; i++) {
            // ArrayList with for loop ArrayList.remove(i).
//            fillAndDeleteArrayV1();

            // ArrayList with List.removeAll().
            fillAndDeleteArrayV2();

            // ArrayList with ArrayList.clear().
            fillAndDeleteArrayV3();

            // LinkedList with for loop and LinkedList.removeFirst().
            fillAndDeleteLinkedListV1();

            // LinkedList with List.removeAll().
            fillAndDeleteLinkedListV2();

            // LinkedList with LinkedList.clear().
            fillAndDeleteLinkedListV3();

            // Hashtable with for loop Hashtable.remove(i).
            fillAndDeleteHashtableV1();

            // Hashtable with Hashtable.clear().
            fillAndDeleteHashtableV2();
        }

//        // ArrayList with for loop ArrayList.remove(i).
//        fillAndDeleteArrayV1();
//
//        // ArrayList with List.removeAll().
//        fillAndDeleteArrayV2();
//
//        // ArrayList with ArrayList.clear().
//        fillAndDeleteArrayV3();
//
//        // LinkedList with for loop and LinkedList.removeFirst().
//        fillAndDeleteLinkedListV1();
//
//        // LinkedList with List.removeAll().
//        fillAndDeleteLinkedListV2();
//
//        // LinkedList with LinkedList.clear().
//        fillAndDeleteLinkedListV3();
//
//        // Hashtable with for loop Hashtable.remove(i).
//        fillAndDeleteHashtableV1();
//
//        // Hashtable with Hashtable.clear().
//        fillAndDeleteHashtableV2();

    }

    private static void fillAndDeleteArrayV1() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.remove(0);
        }
    }

    private static void fillAndDeleteArrayV2() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        integerArrayList.removeAll(integerArrayList);
    }

    private static void fillAndDeleteArrayV3() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        integerArrayList.clear();
    }

    private static void fillAndDeleteLinkedListV1() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.removeFirst();
        }
    }

    private static void fillAndDeleteLinkedListV2() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        integerLinkedList.removeAll(integerLinkedList);

    }

    private static void fillAndDeleteLinkedListV3() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        integerLinkedList.clear();
    }

    private static void fillAndDeleteHashtableV1() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.put(i, random.nextInt(9999));
        }
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.remove(i);
        }
    }

    private static void fillAndDeleteHashtableV2() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.put(i, random.nextInt(9999));
        }
        integerHashtable.clear();
    }

}
