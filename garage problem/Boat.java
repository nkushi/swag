package Garage;
"hello"
public class Boat extends Vehicle {
	
	boolean hasPropellers;

	
	Boat(boolean hasPropellers, String make, String color, int id)
	{
		this.hasPropellers = hasPropellers;
		this.make = make;
		this.color = color;
		this.id = id;
	}
	
	private void takeInput()
	{
		int input = InputClass.nextInt();
	}
}
