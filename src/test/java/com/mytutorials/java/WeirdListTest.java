package com.mytutorials.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WeirdListTest {

    /**
     * Seen in Mike Møller Nielsen YouTube
     * <a href="https://www.youtube.com/watch?v=B4Cyxt3Hr98">...</a>
     * <p>
     * remove() from List interface have a different implementation than remove() from Collection.
     */

    @Test
    public void testList() {

        // Normal behaviour: Removing an element from ArrayList, at a given index.
        List<Integer> myList = new ArrayList<>(List.of(5, 23, 17, 99, 547, 632, 7));
        System.out.println("myList = " + myList);

        myList.remove(5); // This will remove 632 in index 5
        System.out.println("myList = " + myList); // myList = [5, 23, 17, 99, 547, 7]


        // Now, let's try with Collection instead
        Collection<Integer> myCollection = new ArrayList<>(List.of(5, 77, 17, 4, 99, 95, 47, 7));
        System.out.println("myCollection = " + myCollection);

        myCollection.remove(4); // This will remove 4 instead of 99 at Index 4
        System.out.println("myCollection = " + myCollection); // myCollection = [5, 77, 17, 99, 95, 47, 7]

        // When using List, intellij put a tooltip: index
        // When using Collection, intellij put a tooltip: o as object
    }


    // Java Random is not Really Number
    // Millions of record can prove that
    @Test
    public void testShuffle() {
        List<Integer> listOfRandoms = new ArrayList<>(List.of(5, 23, 17, 99, 547, 632, 7));

        for (int i = 0; i < 10 ; i++) {
            Collections.shuffle(listOfRandoms);
            System.out.println("listOfRandoms = " + listOfRandoms);
        }
    }
}
