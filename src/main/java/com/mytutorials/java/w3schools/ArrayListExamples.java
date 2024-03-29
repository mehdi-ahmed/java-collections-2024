package com.mytutorials.java.w3schools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {


    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        // Add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); // [Volvo, BMW, Ford, Mazda]

        // Access an Item
        System.out.println(cars.get(2)); // Ford

        // Change an item
        cars.set(2, "Tesla");

        // remove an item
        cars.remove(0);

        // stream print
        cars.stream()
                .map(c -> c + " ")
                .forEach(System.out::print); // BMW Tesla Mazda

        // remove all
        cars.clear();

        // get the size
        System.out.println(cars.size()); //0

        // sort
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(-22);
        numbers.add(177);
        numbers.add(14);
        numbers.add(87);
        numbers.add(81);

        Collections.sort(numbers);
        System.out.println(numbers); // [-22, 14, 15, 81, 87, 177]


    }
}
