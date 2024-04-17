package com.mytutorials.java.comparator;

public class Player implements Comparable<Player> {

    public int ranking;
    public String name;
    public int age;

    public Player(int age, String name, int ranking) {
        this.age = age;
        this.name = name;
        this.ranking = ranking;
    }

    public Player() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(getRanking(), o.ranking);
    }
}
