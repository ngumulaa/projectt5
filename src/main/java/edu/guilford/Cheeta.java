package edu.guilford;

public class Cheeta extends Animal  {
    
   // Constructor 
    public Cheeta(String type, String color, int legs, double size, String sound, boolean vegetarian) {
         super(type, color, legs, size, sound, vegetarian);

    }

    // constructor with parameters 
     public Cheeta() {
          super("cheeta", "yellow", 4, 4.5, "roar", false);
     }

     // implement the compareTo method 
     public int compareTo(Animal other) {
         return this.getSound().compareTo(other.getSound());
     }





    
}