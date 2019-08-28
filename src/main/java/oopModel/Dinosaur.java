package oopModel;

public abstract class Dinosaur {
	
	private String name;
//	private String diet;
	private boolean isHungry;
	private float length;
//	private boolean canFly;
	
	public Dinosaur(String name, boolean isHungry, float length) {
		super();
		this.name = name;
		this.isHungry = isHungry;
		this.length = length;
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

	public float getlength() {
		return length;
	}

	public void setlength(float length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return " [Hungry: "+ isHungry + ", Length: " + length + " meters]"+'\n';
	}

}
