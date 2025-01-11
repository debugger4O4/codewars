package kyu_7.the_office_i_outed.java;

public class Person {
    final String name;    // team member's name
    final int happiness;  // happiness rating out of 10

    public Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }
}
