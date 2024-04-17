package com.mytutorials.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerMain {

    public static void main(String[] args) {

        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam); //compilation Error goes away when Player implements Comparable<Player>
        System.out.println("After Sorting : " + footballTeam);


        // Comparator approach
        PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerAgeComparator);
        System.out.println("After Sorting : " + footballTeam);


        // java 8 Lambda comparing() static factory

        Comparator<Player> byAgeJava8Comparator = Comparator.comparingInt(Player::getAge);
        Collections.sort(footballTeam, byAgeJava8Comparator);


        // One liner
        Comparator<Player> oneLinercomparator = Comparator.comparingInt(Player::getAge);


    }
}
