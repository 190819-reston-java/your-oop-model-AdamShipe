package oopModel;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Velociraptor extends Dinosaur implements Serializable, Carnivore {
	
	public static int raptorPop = 0;
//	public static int casualties = 0;
	private double length;
	private double weight;
	private double age;
	private int visibleAge;
	private double size;
	DecimalFormat df = new DecimalFormat("#,###.#");
	
	public Velociraptor(String name, boolean isHungry) {
		super(name, isHungry);
		raptorPop++;
		this.age = 23-(22*Math.random());
		this.visibleAge = Integer.valueOf(String.format("%.0f", age));
		this.size = Double.valueOf(df.format(.0013*(800-(Math.pow(23-age, 2)))));
		this.length = Double.valueOf(df.format(size*(2.0-(.7*Math.random()))));
		this.weight = Double.valueOf(df.format(size*33));
	}
	//Overloading
	
	public Velociraptor(String name) {
		super(name);
		raptorPop++;
	}
	
	public Velociraptor() {
		super();
		raptorPop++;
	}
	
	
	public boolean isHungry() {
		System.out.println(this.getName()+" is hungry");
		setHungry(true);
		return true;
	}
	
	public int getVisibleAge() {
		return visibleAge;
	}
	
	
	public void hunt() {
		System.out.println(this.getName()+" is looking for prey");
	}

	
	public int compareTo(Velociraptor o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return super.getName() + " age: " + visibleAge + " weight: " + weight + " lbs, length: " + length + " meters";
	}
}


