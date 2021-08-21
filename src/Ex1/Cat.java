package Ex1;

public class Cat extends Mammal {
	private int age;
	private String hobbies;
	private String eyeOfColor;
	private String petname;
	protected Cat(String name, String species, double height, double weight, String habitat, String form,
			int numberOfFoot, String color, int numberOfTeeth, String behavior) {
		super(name, species, height, weight, habitat, form, numberOfFoot, color, numberOfTeeth, behavior);
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getEyeOfColor() {
		return eyeOfColor;
	}
	public void setEyeOfColor(String eyeOfColor) {
		this.eyeOfColor = eyeOfColor;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public Cat(String name, String species, double height, double weight, String habitat, String form, int age,
			String hobbies, String eyeOfColor, String petname) {
		super(name, species, height, weight, habitat, form);
		this.age = age;
		this.hobbies = hobbies;
		this.eyeOfColor = eyeOfColor;
		this.petname = petname;
	}

}
