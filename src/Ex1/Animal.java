package Ex1;

public class Animal {
	private String name;
	private String species;
	private double height;
	private double weight;
	private String habitat;
	private String form;

	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSpecies() {
		return species;
	}
	protected void setSpecies(String species) {
		this.species = species;
	}
	protected double getHeight() {
		return height;
	}
	protected void setHeight(double height) {
		this.height = height;
	}
	protected double getWeight() {
		return weight;
	}
	protected void setWeight(double weight) {
		this.weight = weight;
	}
	protected String getHabitat() {
		return habitat;
	}
	protected void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	protected String getForm() {
		return form;
	}
	protected void setForm(String form) {
		this.form = form;
	}
	
	protected Animal(String name, String species, double height, double weight, String habitat, String form) {
		super();
		this.name = name;
		this.species = species;
		this.height = height;
		this.weight = weight;
		this.habitat = habitat;
		this.form = form;
	}
	protected void eat() {
		
	}
	protected void sleep() {
		
	}
	protected void move() {
		
	}
	protected void play() {
		
	}
}
