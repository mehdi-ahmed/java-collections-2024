package com.mytutorials.java.w3schools;

import java.util.Objects;

public class People {

    private int age;
    private String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;
        return getAge() == people.getAge() && Objects.equals(getName(), people.getName());
    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + Objects.hashCode(getName());
        return result;
    }
}
