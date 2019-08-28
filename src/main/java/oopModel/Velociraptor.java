package oopModel;

import java.io.Serializable;

public class Velociraptor extends Dinosaur implements Serializable, Carnivore {
	
	public static int packSize = 0;
	public static int casualties = 0;
	
	public Velociraptor(String name, boolean isHungry, float length) {
		super(name, isHungry, length);
		packSize++;
	}
	//Overloading
	public Velociraptor(String name, boolean isHungry) {
		super(name, isHungry);
		packSize++;
	}
	
	public Velociraptor(String name) {
		super(name);
		packSize++;
	}
	
	public Velociraptor() {
		super();
		packSize++;
	}
	
	
	public boolean isHungry() {
		System.out.println(this.getName()+" is hungry");
		setHungry(true);
		return true;
	}
	
	
	public void hunt() {
		System.out.println(this.getName()+" is looking for prey");
	}

	public void hunt(Pterodactyl pter) {
		System.out.println(this.getName()+" can't catch a Pterodactyl");
	}

	public void hunt(Tyrannosaurus rex) {
		packSize--;
		System.out.println("Size of the velociraptor pack: " + Velociraptor.packSize);
	
		}
	}
	

