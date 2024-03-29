package com.mytutorials.java.w3schools;

import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<Integer> years = new LinkedList<>();

        years.add(2000);
        years.add(1981);
        years.add(2011);
        years.add(2024);
        years.add(2011);

        System.out.println("years = " + years);

        // addFirst and removeLast
        years.addFirst(0);
        years.removeLast();
        System.out.println("years = " + years); // years = [0, 2000, 1981, 2011, 2024]
    }


}
