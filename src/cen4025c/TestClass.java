package cen4025c;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

/**
 * For Assignment 4 - jProfiler, CEN 4025C-15911, Software Development II. This class contains methods which add 2,000,000 random
 * numbers to either an ArrayList, LinkedList, or Hashtable and then deletes the contents of the collection.
 *
 * @author Stephen Sturges Jr
 * @version 09/24/2022
 */
public class TestClass {

    /**
     * This is the main method. There are two sections, one that loops 100 times calling all the methods, and another
     * for calling the methods just once. Currently, I am commenting/uncommenting the sections to switch between the
     * looping or not.
     *
     * @param args
     */
    public static void main(String[] args) {

// Run 100 times:
//        // Loop through methods 100 times.
//        for (int i = 0; i < 100; i++) {
//            // ArrayList with for loop ArrayList.remove(i).
////            fillAndDeleteArrayV1();
//
//            // ArrayList with List.removeAll().
////            fillAndDeleteArrayV2();
//
//            // ArrayList with ArrayList.clear().
//            fillAndDeleteArrayV3();
//
//            // LinkedList with for loop and LinkedList.removeFirst().
//            fillAndDeleteLinkedListV1();
//
//            // LinkedList with List.removeAll().
//            fillAndDeleteLinkedListV2();
//
//            // LinkedList with LinkedList.clear().
//            fillAndDeleteLinkedListV3();
//
//            // Hashtable with for loop Hashtable.remove(i).
//            fillAndDeleteHashtableV1();
//
//            // Hashtable with Hashtable.clear().
//            fillAndDeleteHashtableV2();
//        }

// Single run:
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

    /**
     * Fills an ArrayList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using a
     * for loop.
     */
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

    /**
     * Fills an ArrayList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using the
     * List class's removeAll() method.
     */
    private static void fillAndDeleteArrayV2() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        integerArrayList.removeAll(integerArrayList);
    }

    /**
     * Fills an ArrayList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using the
     * ArrayList class's clear() method.
     */
    private static void fillAndDeleteArrayV3() {
        Random random = new Random();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(2000000);
        for (int i = 0; i < 2000000; i++) {
            integerArrayList.add(random.nextInt(9999));
        }
        integerArrayList.clear();
    }

    /**
     * Fills a LinkedList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using a
     * for loop and the LinkList's removeFirst() method.
     */
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

    /**
     * Fills a LinkedList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using the
     * List class's removeAll() method.
     */
    private static void fillAndDeleteLinkedListV2() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        integerLinkedList.removeAll(integerLinkedList);

    }

    /**
     * Fills a LinkedList with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using the
     * List class's clear() method.
     */
    private static void fillAndDeleteLinkedListV3() {
        Random random = new Random();
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerLinkedList.add(random.nextInt(9999));
        }
        integerLinkedList.clear();
    }

    /**
     * Fills a Hashtable with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using
     * a for loop and Hashtable's remove() method.
     */
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

    /**
     * Fills a Hashtable with 2,000,000 random numbers between 0 and 9999, and then removes all these numbers using
     * Hashtable's clear() method.
     */
    private static void fillAndDeleteHashtableV2() {
        Random random = new Random();
        Hashtable<Integer, Integer> integerHashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < 2000000; i++) {
            integerHashtable.put(i, random.nextInt(9999));
        }
        integerHashtable.clear();
    }

}
