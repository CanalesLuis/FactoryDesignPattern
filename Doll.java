/*
Extends Toy to overload assemble in order to output the following text
*/
public class Doll extends Toy{
	
	public Doll() {
		name = "Doll";
	}
	
	public void assemble() {
		System.out.println("Connecting all the pieces"
				+ "\nPainting the face\nAdding the dress"
				+ "Adding the Shoes");
		
	}
	
}
