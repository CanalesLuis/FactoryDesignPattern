/*
Extends Toy to overload assemble in order to output the following text
*/
public class Rattle extends Toy{
	
	public Rattle() {
		name = "Rattle";
	}
	
	public void assemble() {
		System.out.println("Create the frame"
				+ "\nAdd the pebbles\nSecure the sides");
		
	}
	
}
