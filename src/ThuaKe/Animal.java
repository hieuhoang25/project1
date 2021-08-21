package ThuaKe;

public class Animal {
	private String name;
	private float weight;
	public Animal(String name2, float weight2) {
		// TODO Auto-generated constructor stub
	}
	public void move() {
		
	}
	private void eat() {
		
	}
	public void sleep() {
		
	}
}
class Cat extends Animal{

	private String color;
	private String favoriteFood;

	public Cat(String name, float weight,String color, String favoriteFood) {
		super(name, weight);
		this.color = color;
		this.favoriteFood = favoriteFood;
	}
//	ko truy cap duco thanh phan private cua lop cha
	public void eat() {
		// goi dc thanh phan cuar public cua lop cha
		super.move();
	}
	public void move() {
		
	}
	
}
