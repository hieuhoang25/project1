package Ex1;

public class Mammal extends Animal{
	private int numberOfFoot;
	private String color;
	private int numberOfTeeth;
	private String behavior;
	
	public int getNumberOfFoot() {
		return numberOfFoot;
	}

	public void setNumberOfFoot(int numberOfFoot) {
		this.numberOfFoot = numberOfFoot;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getNumberOfTeeth() {
		return numberOfTeeth;
	}

	public void setNumberOfTeeth(int numberOfTeeth) {
		this.numberOfTeeth = numberOfTeeth;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}




	public Mammal(String name, String species, double height, double weight, String habitat, String form) {
		super(name, species, height, weight, habitat, form);
		// TODO Auto-generated constructor stub
	}

	protected Mammal(String name, String species, double height, double weight, String habitat, String form,
			int numberOfFoot, String color, int numberOfTeeth, String behavior) {
		super(name, species, height, weight, habitat, form);
		this.numberOfFoot = numberOfFoot;
		this.color = color;
		this.numberOfTeeth = numberOfTeeth;
		this.behavior = behavior;
		
	}
	
}
