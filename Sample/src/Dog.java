
public class Dog extends Animal{

	public Dog(String name, int brain, int body, int size, int weight) {
		super(name, brain, body, size, weight);

	}
	
	@Override
	public void move(){
		System.out.println("moving as a dog");
	}
	
}
