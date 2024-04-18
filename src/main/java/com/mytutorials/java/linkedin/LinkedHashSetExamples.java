package com.mytutorials.java.linkedin;

import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apples");
        set.add("Oranges");
        set.add("Bananas");
        set.add("Pears");
        set.add("Grapes");

        // Adding a duplicate - This will not be added as LinkedHashSet preserves Order and does not allow duplicates.
        set.add("Oranges");

        for (String fruit : set) {
            System.out.println("fruit = " + fruit);
        }
      /*
        fruit = Apples
        fruit = Oranges
        fruit = Bananas
        fruit = Pears
        fruit = Grapes */
    }
}
