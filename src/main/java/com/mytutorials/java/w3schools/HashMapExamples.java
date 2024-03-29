package com.mytutorials.java.w3schools;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HashMapExamples {

    public static void main(String[] args) {

        Map<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Belgium", "Brussels");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("capitalCities = " + capitalCities);
        // capitalCities = {USA=Washington DC, Belgium=Brussels, Norway=Oslo, Germany=Berlin}


        // Access an Item
        String belgiumCapital = capitalCities.get("Belgium");
        System.out.println("Belgium capital = " + belgiumCapital); // belgiumCapital = Brussels

        // Remove an Item
        capitalCities.remove("England");


        // HashMap Size
        System.out.println("HashMap size = " + capitalCities.size());

        // Loop Through a HashMap
        // Print keys
        for (String c : capitalCities.keySet()) {
            System.out.println("c = " + c);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Remove all
        capitalCities.clear();


        // Dealing with Objects
        HashMap<UUID, People> peoplesMap = new HashMap<>();

        People person1 = new People(43, "Marcus");
        People person2 = new People(33, "Sara");

        peoplesMap.put(UUID.randomUUID(), person1);
        peoplesMap.put(UUID.randomUUID(), person2);

        // Print values
        for (People p : peoplesMap.values()) {
            System.out.println(p.getName());
        }


    }
}
