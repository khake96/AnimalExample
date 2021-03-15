package zoology.animal;

import java.io.IOException;

public class GermanShepherd  extends Dog implements Animal  {
	
	private String trained;
	

	public GermanShepherd() {
		super();
	}

	public String getTrained() {
	
		return trained;
	}
	
	public String getSpeed() throws IOException {
		throw new IOException("Your dog can't run.");
	}

	public void setTrained(String trained) throws Exception{
		if(trained == "") throw new Exception("Please provide a valid string.");
		else this.trained = trained;
	}

	public String eat() {
		return "Chicken eggs";
	}

	@Override
	public String color() {
		return "Black and tan";
	}

}
