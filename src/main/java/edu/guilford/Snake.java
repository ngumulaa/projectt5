package edu.guilford;

public class Snake extends Animal {
    // constructor
    public Snake(String type, String color, int legs, double size, String sound, boolean vegetarian) {
        super(type, color, legs, size, sound, vegetarian);

    }

    // constructor with parameters
    public Snake() {
        super("snake", "green", 0, 2.5, "hiss", false);
    }

    // implement the compareTo method
    public int compareTo(Animal other) {
        return this.getSound().compareTo(other.getSound());
    }
}
