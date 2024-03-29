package com.mytutorials.java.w3schools;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArraysExamples {

    public static void main(String[] args) {

        String[] bikes;

        String[] cars = {"Volvo", "BMW", "AUDI", "Tesla"};

        // Accessing elements
        String volvo = cars[0];

        // Changing an element
        cars[2] = "Opel";

        // Different ways to initialize and Array

        String[] colors = new String[]{"Red", "Blue", "Yellow", "Orange", "Black"};

        String[] initializedArray = new String[100];

        String[] randomArray = {"foo", "bar"};

        String[] strings = Stream.of("First", "Second", "Third").toArray(String[]::new);


        // Looping through an array and displaying items
        Arrays.stream(cars).forEach(System.out::println); // Volvo, BMW, Opel, Tesla

        //Array length
        System.out.println(cars.length); //3

        // Sorting an Array of int
        int[] nums = {10, 20, 90, 75, 22, 99, 14, 6, 177, 55, 11};
        Arrays.sort(nums);
        Arrays.stream(nums)
                .mapToObj(num -> num + " ")
                .forEach(System.out::print); // 6 10 11 14 20 22 55 75 90 99 177


        // sort in reverse order
        // Integer instead of int
        Integer[] array = {99, 77, 55, 125, -12, 16, 74, 15};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("array = " + Arrays.toString(array)); //[125, 99, 77, 74, 55, 16, 15, -12]


    }
}
