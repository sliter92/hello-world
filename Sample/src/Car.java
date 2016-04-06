
public class Car extends Vehicle{
	
	private int doors;
	private int maxSpeed;

	public Car(String model, int year, String color, int doors, int maxSpeed) {
		super(model, year, color);
		this.doors = doors;
		this.maxSpeed = maxSpeed;
	}
	
	public void changeGears(){
		System.out.println("Changing gears");
	}
	
	public void move(int speed){
		if(speed>maxSpeed){
			System.out.println("You can't go this fast");
		}
		else{
			super.move(speed);
		}
	}
}
