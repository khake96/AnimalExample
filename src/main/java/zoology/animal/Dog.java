package zoology.animal;

public abstract class Dog {
	
	private final int legs = 4;
	private String movement;
	private int height;
	private int weight;
	private int lifeExpectancy;
	private boolean friendly;
	
	public String move() {
		return "Dog "+movement;
	}
	
	public int legs() {
		return legs;
	}
	
	public abstract String color();

}
