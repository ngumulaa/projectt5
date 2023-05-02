package edu.guilford;

public class Crab extends Animal {
    // constructor
    public Crab(String type, String color, int legs, double size, String sound, boolean vegetarian) {
        super(type, color, legs, size, sound, vegetarian);

    }

    // constructor with parameters
    public Crab() {
        super("crab", "red", 8, 1.5, "click", false);
    }

    // implement the compareTo method
    public int compareTo(Animal other) {
        return this.getSound().compareTo(other.getSound());
    }
}
