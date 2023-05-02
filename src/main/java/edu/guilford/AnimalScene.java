package edu.guilford;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class AnimalScene 
{
    public static void main( String[] args ) {
        
        // create an object for each class
        Animal cheeta = new Animal();
        System.out.println(cheeta); 
        Animal crab = new Animal();
        System.out.println(crab);
        Animal snake = new Animal(); 
        System.out.println(snake);

        // create an array of animals of 5
        Animal[] animals = new Animal[15];   
        for(int i = 0; i < animals.length; i++) {
            animals[i] = new Animal();
        }

        // print the array of animals object 
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        Animal.sortOrder = Animal.SortOrder.REVERSE;
        Arrays.sort(animals);

        System.out.println("After sorting: ");
        for(int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }





       
    }
}
