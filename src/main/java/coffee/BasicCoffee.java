package coffee;

import java.util.function.Consumer;

public class BasicCoffee implements Coffee {

	private double cost = 3.99;
	private Consumer<String> addThing;

	public void setAddThing( Consumer<String> addThing) {
		this.addThing = addThing;
	}
	
	@Override
	public double makeCoffee() {
		addThing.accept("Black Coffee: $3.99");
		System.out.println("Black Coffee: $3.99");
		
		return cost;
	}

	

}
