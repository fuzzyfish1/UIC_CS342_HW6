package coffee;

import java.util.function.Consumer;

public class Syrup extends CoffeeDecorator {

    private final double cost = .25;
    private Consumer<String> addThing;
    public Syrup(Coffee specialCoffee) {
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addSyrup();
    }

    private double addSyrup() {
        addThing.accept(" + Syrup: $.25");
        System.out.println(" + Syrup: $.25");

        return cost;
    }

    public void setAddThing(java.util.function.Consumer<String> addThing) {
        this.addThing = addThing;
    }
}