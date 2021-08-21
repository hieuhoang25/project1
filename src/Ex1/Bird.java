package Ex1;

public class Bird extends Animal {
	private String color;
	private String foodMain;
	private String wingspan;
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getFoodMain() {
		return foodMain;
	}



	public void setFoodMain(String foodMain) {
		this.foodMain = foodMain;
	}



	public String getWingspan() {
		return wingspan;
	}



	public void setWingspan(String wingspan) {
		this.wingspan = wingspan;
	}



	public Bird(String name, String species, double height, double weight, String habitat, String form, String color,
			String foodMain, String wingspan) {
		super(name, species, height, weight, habitat, form);
		this.color = color;
		this.foodMain = foodMain;
		this.wingspan = wingspan;
	}



	protected Bird(String name, String species, double height, double weight, String habitat, String form) {
		super(name, species, height, weight, habitat, form);
		// TODO Auto-generated constructor stub
	}
	
}
