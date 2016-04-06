
public class Vehicle {
	private String model;
	private int year;
	private String color;
	
	public Vehicle(String model, int year, String color){
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public void move(int speed){
		System.out.println("Moving @: "+speed);
	}
}
