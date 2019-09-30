/*
Extends Toy to overload assemble in order to output the following text
*/
public class Car extends Toy{
	
	public Car() {
		name = "Car";
	}
	
	public void assemble() {
		System.out.println("Make the body"
				+ "\nAdd the wheels\nPaint the car");
		
	}
	
}
