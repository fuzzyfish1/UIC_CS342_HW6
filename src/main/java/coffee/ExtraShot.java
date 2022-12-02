package coffee;

import java.util.function.Consumer;

public class ExtraShot extends CoffeeDecorator {

	private final double cost = 1.20;
	private Consumer<String> addThing;
	public ExtraShot(Coffee specialCoffee) {
		super(specialCoffee);
	}

	public double makeCoffee() {
		return specialCoffee.makeCoffee() + addExtraShot();
	}

	private double addExtraShot() {
		addThing.accept(" + ExtraShot: $1.20");
		System.out.println(" + ExtraShot: $1.20");

		return cost;
	}

	public void setAddThing(java.util.function.Consumer<String> addThing) {
		this.addThing = addThing;
	}
}