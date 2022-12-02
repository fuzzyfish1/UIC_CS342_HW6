package coffee;

import java.util.function.Consumer;

public class Cream extends CoffeeDecorator {

	private final double cost = .50;
	private Consumer<String> addThing;
	public Cream(Coffee specialCoffee) {
		super(specialCoffee);
	}

	public double makeCoffee() {
		return specialCoffee.makeCoffee() + addCream();
	}

	private double addCream() {
		addThing.accept(" + Cream: $.50");
		System.out.println(" + Cream: $.50");

		return cost;
	}

	public void setAddThing(java.util.function.Consumer<String> addThing) {
		this.addThing = addThing;
	}
}