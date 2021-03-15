package zoology.animal.test;

import java.io.IOException;

import zoology.animal.Bulldog;
import zoology.animal.Dog;
import zoology.animal.GermanShepherd;

public class AnimalDriver {
	
	public static void main (String args[]) {
		
		Dog myFirstDog = new Bulldog();
		// myFirstDog. // We see the methods for the Abstract class only, not the concrete class.
		System.out.println(((Bulldog) myFirstDog).getHowMuchSlobber());
		System.out.println(((Bulldog) myFirstDog).move()); // With reference casting we can access both the parent and child methods
		
		
		Dog mySecondDog = new GermanShepherd();
		
		try {
			((GermanShepherd) mySecondDog).getSpeed();
		} catch (IOException e) {
			// Forced to deal with the checked Exception
			e.printStackTrace();
		}
	
	}

}
