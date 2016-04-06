
public class Porsche extends Car{
	private static int maxSpeed = 200;
	private static int doors = 4;

	public Porsche(String model, int year, String color) {
		super(model, year, color, doors, maxSpeed);
	}
	
	public void handSteer(){
		System.out.println("Steering");
	}

}
