package coffee;

import java.util.function.Consumer;

public abstract class CoffeeDecorator implements Coffee {
	protected Coffee specialCoffee;

	public CoffeeDecorator(Coffee specialCoffee) {
		this.specialCoffee = specialCoffee;
	}

	public double makeCoffee() {
		return specialCoffee.makeCoffee();
	}
}
