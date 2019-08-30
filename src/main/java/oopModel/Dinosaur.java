package oopModel;

import java.text.DecimalFormat;

public abstract class Dinosaur {
	
	private String name;
	private boolean isHungry;
	
	public Dinosaur(String name, boolean isHungry, double weight) {
		super();
		this.name = name;
		this.isHungry = isHungry;
	}
	//Overloading
	public Dinosaur(String name, boolean isHungry) {
		this(name, true, 1.8f);
	}
		
	public Dinosaur(String name) {
		this(name, true);
	}
	
	public Dinosaur() {
		this("William");
	}
		
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
