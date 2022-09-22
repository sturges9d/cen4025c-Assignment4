package cen4025c;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class TestClass {

    public static void main(String[] args) {

//        // Loop through methods 100 times.
//        for (int i = 0; i < 100; i++) {
//            // ArrayList
//            fillAndDeleteArray();
//
//            // LinkedList
//            fillAndDeleteLinkedList();
//
//            // Hashtable
//            fillAndDeleteHashtable();
//        }

        // ArrayList with for loop ArrayList.remove(i).
        fillAndDeleteArrayV1();

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

    private static void fillAndDeleteArrayV1() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        System.out.println("ArrayListV1 size after filling: " + integerArrayList.size());
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.remove(0);
        }
        System.out.println("ArrayListV1 size after removal: " + integerArrayList.size());
    }

    private static void fillAndDeleteArrayV2() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        System.out.println("ArrayListV2 size after filling: " + integerArrayList.size());
        integerArrayList.removeAll(integerArrayList);
        System.out.println("ArrayListV2 size after removal: " + integerArrayList.size());
    }

    private static void fillAndDeleteArrayV3() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        System.out.println("ArrayListV3 size after filling: " + integerArrayList.size());
        integerArrayList.clear();
        System.out.println("ArrayListV3 size after removal: " + integerArrayList.size());
    }

    private static void fillAndDeleteLinkedListV1() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        System.out.println("LinkedListV1 after filling: " + integerLinkedList);
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.removeFirst();
        }
        System.out.println("LinkedListV1 after removal: " + integerLinkedList);
    }

    private static void fillAndDeleteLinkedListV2() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        System.out.println("LinkedListV2 after filling: " + integerLinkedList);
        integerLinkedList.removeAll(integerLinkedList);
        System.out.println("LinkedListV2 after removal: " + integerLinkedList);
    }

    private static void fillAndDeleteLinkedListV3() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        System.out.println("LinkedListV2 after filling: " + integerLinkedList);
        integerLinkedList.clear();
        System.out.println("LinkedListV2 after removal: " + integerLinkedList);
    }

    private static void fillAndDeleteHashtableV1() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.put(i, random.nextInt(9999));
        }
        System.out.println("HashtableV1 after filling: " + integerHashtable);
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.remove(i);
        }
        System.out.println("HashtableV1 after removal: " + integerHashtable);
    }

    private static void fillAndDeleteHashtableV2() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.put(i, random.nextInt(9999));
        }
        System.out.println("HashtableV2 after filling: " + integerHashtable);
        integerHashtable.clear();
        System.out.println("HashtableV2 after removal: " + integerHashtable);
    }

}
