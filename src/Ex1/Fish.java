package Ex1;

public class Fish extends Animal {

	protected Fish(String name, String species, double height, double weight, String habitat, String form) {
		super(name, species, height, weight, habitat, form);
		// TODO Auto-generated constructor stub
	}
	private String color;
	private String food;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public Fish(String name, String species, double height, double weight, String habitat, String form, String color,
			String food) {
		super(name, species, height, weight, habitat, form);
		this.color = color;
		this.food = food;
	}
	
}
