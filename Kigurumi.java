package practice;

public class Kigurumi {

	
	private String animal;
	private String color;
	private boolean hasPaws;
	public Kigurumi(String animal, String color) {
		super();
		this.animal = animal;
		this.color = color;
	}
	public Kigurumi() {
		super();
	}
	public Kigurumi(String animal, String color, boolean hasPaws) {
		super();
		this.animal = animal;
		this.color = color;
		this.hasPaws = hasPaws;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isHasPaws() {
		return hasPaws;
	}
	public void setHasPaws(boolean hasPaws) {
		this.hasPaws = hasPaws;
	}
	
	

}
