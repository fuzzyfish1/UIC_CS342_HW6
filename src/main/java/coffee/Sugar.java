package coffee;

import java.util.function.Consumer;

public class Sugar extends CoffeeDecorator {

	private final double cost = .50;
	private Consumer<String> addThing;
	public Sugar(Coffee specialCoffee) {
		super(specialCoffee);
	}

	public double makeCoffee() {
		return specialCoffee.makeCoffee() + addSugar();
	}

	private double addSugar() {
		addThing.accept(" + Sugar: $.50");
		System.out.println(" + Sugar: $.50");

		return cost;
	}

	public void setAddThing(java.util.function.Consumer<String> addThing) {
		this.addThing = addThing;
	}
}
