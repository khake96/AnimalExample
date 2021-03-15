package zoology.animal;

public class Bulldog extends Dog implements Animal {

	private int howMuchSlobber;
	private String petName;


	public Bulldog(int howMuchSlobber, String petName) {
		super();
		this.howMuchSlobber = howMuchSlobber;
		this.petName = petName;
	}
	
	@Override
	public String move() {
		return "My bulldog is moving sideways.";
	}

	public int getHowMuchSlobber() {
		return howMuchSlobber;
	}

	public void setHowMuchSlobber(int howMuchSlobber) {
		this.howMuchSlobber = howMuchSlobber;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int maintenanceCost(int price, int quantity) {
		
		return price*quantity;
	}
	
	public int putToSleep() {
		
		return Integer.valueOf((int) (Math.random()*8));
	}
	
	public Bulldog() {
		super();

	}

	public String eat() {
		return "Small children";
	}

	@Override
	public String color() {
		return "Brindled";
	}
	
	

}
