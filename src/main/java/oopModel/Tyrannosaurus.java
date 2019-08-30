package oopModel;

import java.io.Serializable;

public class Tyrannosaurus extends Dinosaur implements Carnivore, Serializable {

	public Tyrannosaurus() {
		// TODO Auto-generated constructor stub
	}

	public void hunt() {
		System.out.println("Tyrannosaurus "+this.getName()+" is looking for prey.  The velociraptors scatter.");
	}
	@Override
	public String toString() {
		return "Tyrannosaurus " + this.getName() + " the mighty";
	}
}
