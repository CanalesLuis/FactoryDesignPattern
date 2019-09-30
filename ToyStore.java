
public abstract class ToyStore {
	
	public Toy orderToy(String type) {
		Toy toy = orderToy(type);
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
}
