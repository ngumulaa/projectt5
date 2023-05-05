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
        // create three new snake objects
        Snake snake1 = new Snake("snake", "brown", 0, 2.5, "croak", false);
        Snake snake2 = new Snake("snake", "brown", 1, 4.5, "hiss", false);
        Snake snake3 = new Snake("snake", "brown", 7, 6.5, "neigh", false);

        // create three new cheeta objects
        Cheeta cheeta1 = new Cheeta("cheeta", "tan", 4, 5.8, "roar", true);
        Cheeta cheeta2 = new Cheeta("cheeta", "magenta", 4, 5.8, "meow", true);
        Cheeta cheeta3 = new Cheeta("cheeta", "gold", 4, 5.8, "chirp", true);

        // instantiate at least three new objects of each subclass (crab, snake, cheeta)
        Crab crab1 = new Crab("crab", "red", 10, 5.5, "gobble", true);
        Crab crab2 = new Crab("crab", "blue", 10, 7.5, "click", true);
        Crab crab3 = new Crab("crab", "yellow", 10, 2.5, "buzz", true);

        // create an array of 3 snakes
        Snake[] snakes  = new Snake[3];   
        snakes [0] = snake1;
        snakes [1] = snake2;
        snakes [2] = snake3;
        // print the array of animals object 
        System.out.println("Snakes: ");
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }
        // sort the array using the sort method in the Arrays class
        Arrays.sort(snakes);
        // print the array of animals object
        System.out.println("After sorting: ");
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }

        Snake.sortOrder = Snake.SortOrder.REVERSE;
        Arrays.sort(snakes);
        System.out.println("After sorting in reverse: ");
        for(int i = 0; i < snakes.length; i++) {
            System.out.println(snakes[i]);
        }

        // create an array of 3 cheetas
        Cheeta[] cheetas  = new Cheeta[3];
        cheetas [0] = cheeta1;
        cheetas [1] = cheeta2;
        cheetas [2] = cheeta3;

        // print the array of animals object
        System.out.println("Cheetas: ");
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }

        // sort the array using the sort method in the Arrays class
        Arrays.sort(cheetas);
        // print the array of animals object
        System.out.println("After sorting: ");
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }

        Cheeta.sortOrder = Cheeta.SortOrder.REVERSE;
        Arrays.sort(cheetas);
        System.out.println("After sorting in reverse: ");
        for(int i = 0; i < cheetas.length; i++) {
            System.out.println(cheetas[i]);
        }

        // create an array of 3 crabs
        Crab[] crabs  = new Crab[3];
        crabs [0] = crab1;
        crabs [1] = crab2;
        crabs [2] = crab3;

        // print the array of animals object
        System.out.println("Crabs: ");
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }

        // sort the array using the sort method in the Arrays class
        Arrays.sort(crabs);
        // print the array of animals object
        System.out.println("After sorting: ");
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }

        Crab.sortOrder = Crab.SortOrder.REVERSE;
        Arrays.sort(crabs);
        System.out.println("After sorting in reverse: ");
        for(int i = 0; i < crabs.length; i++) {
            System.out.println(crabs[i]);
        }

    }
}
