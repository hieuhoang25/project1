package EpKieuThuaKe;

public class Cat extends Animal{
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
		
	}
	public void move() {
		
	}
	public void catchMouse() {
		
	}
}
